package com.czStudio.team.controller;

import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.common.core.page.TableDataInfo;
import com.czStudio.domain.TeamCompetition;
import com.czStudio.service.ITeamCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.czStudio.common.core.controller.BaseController;
import java.util.List;



/**
 * Description: TODO
 *
 * @author czStudio
 */

@RestController
@RequestMapping("/competition")
public class TeamCompetitionController extends BaseController {
    @Autowired
    private ITeamCompetitionService teamCompetitionService;

    @GetMapping("/list")
    public AjaxResult list() {
        try {
            List<TeamCompetition> list = teamCompetitionService.list();
            return AjaxResult.success(list);
        } catch (Exception e) {
            logger.error("在获取团队竞赛列表时发生错误", e);
            return AjaxResult.error("获取团队竞赛列表失败");
        }
    }
    @GetMapping("/{id}")
    public AjaxResult detail(@PathVariable Integer id) {
        try {
            TeamCompetition teamCompetition = teamCompetitionService.listById(id);
            return AjaxResult.success(teamCompetition);
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.error("获取团队竞赛详情失败");
        }
    }
}
