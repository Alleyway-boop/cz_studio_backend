package com.czStudio.team.controller;

import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.domain.TeamNews;
import com.czStudio.service.ITeamNewsService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TeamNewsController  {
    @Autowired
private ITeamNewsService teamNewsService;
    @GetMapping("/{id}")
    public AjaxResult detail(@PathVariable Integer id) {
        try {
            TeamNews teamNews = teamNewsService.listById(id);
            return AjaxResult.success(teamNews);
        } catch (Exception e) {
            log.error("获取团队新闻详情失败，ID: {}", id, e);
            return AjaxResult.error("获取团队新闻详情失败");
        }
    }
}
