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
    public TableDataInfo list(){
        startPage();
        List<TeamCompetition> list = teamCompetitionService.list();
        return getDataTable(list);
    }
    @GetMapping("/{id}")
    public AjaxResult detail(@PathVariable Integer id){
        TeamCompetition teamCompetition = teamCompetitionService.listById(id);
        return AjaxResult.success(teamCompetition);
    }
}
