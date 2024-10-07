package com.czStudio.team.controller;
import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.domain.TeamAward;
import com.czStudio.service.ITeamAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@RestController
@RequestMapping("/award")
public class TeamAwardController extends BaseController {
    @Autowired
    private ITeamAwardService teamAwardService;
    @GetMapping("/list")
    public AjaxResult getTeamAwards() {
        List<TeamAward> teamAwards = teamAwardService.list();
        Map<Integer, Map<String, List<TeamAward>>> data = convertToNestedStructure(teamAwards);
        return AjaxResult.success(data);
    }

    private Map<Integer, Map<String, List<TeamAward>>> convertToNestedStructure(List<TeamAward> teamAwards) {
        Map<Integer, Map<String, List<TeamAward>>> nestedData = new HashMap<>();
        for (TeamAward award : teamAwards) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(award.getDate());
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            String yearMonth = year + "-" + String.format("%02d", month);
            nestedData.putIfAbsent(year, new HashMap<>());
            nestedData.get(year).putIfAbsent(yearMonth, new ArrayList<>());
            nestedData.get(year).get(yearMonth).add(award);
        }
        return nestedData;
    }
}
