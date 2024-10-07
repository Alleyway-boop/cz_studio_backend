package com.czStudio.team.controller;

import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.domain.TeamNews;
import com.czStudio.service.ITeamNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@RestController
@RequestMapping("/news")
@CrossOrigin
public class TeamNewsController  {
    @Autowired
private ITeamNewsService teamNewsService;
    @GetMapping("/{id}")
    public AjaxResult detail(@PathVariable Integer id){
        TeamNews teamNews = teamNewsService.listById(id);
        return AjaxResult.success(teamNews);
    }
}
