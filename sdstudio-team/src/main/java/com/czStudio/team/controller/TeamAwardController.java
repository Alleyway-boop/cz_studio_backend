package com.czStudio.team.controller;
import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.domain.TeamAward;
import com.czStudio.service.ITeamAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;
import java.util.stream.Collectors;

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
//    Java 8的流API和Collectors.groupingBy方法来将一个TeamAward列表按照年份和月份分组，
//    并将结果存储在一个嵌套的Map结构中
    private Map<Integer, Map<String, List<TeamAward>>> convertToNestedStructure(List<TeamAward> teamAwards) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        return teamAwards.stream()
                .collect(Collectors.groupingBy(award -> award.getDate().getYear(),
                        Collectors.groupingBy(award -> formatter.format((TemporalAccessor) award.getDate()))));
    }
}
