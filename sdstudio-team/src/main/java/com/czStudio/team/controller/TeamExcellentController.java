package com.czStudio.team.controller;

import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.page.TableDataInfo;
import com.czStudio.domain.TeamExcellent;
import com.czStudio.service.ITeamExcellentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@RestController
@RequestMapping("/excellent")
public class TeamExcellentController extends BaseController {
    @Autowired
    private ITeamExcellentService teamExcellentService;

    @GetMapping("/list")
    public TableDataInfo list(){
        startPage();
        List<TeamExcellent> list = teamExcellentService.list();
        return getDataTable(list);
    }

}
