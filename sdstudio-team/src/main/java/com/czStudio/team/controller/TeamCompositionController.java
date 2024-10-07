package com.czStudio.team.controller;

import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.domain.TeamComposition;
import com.czStudio.service.ITeamCompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.czStudio.common.core.controller.BaseController;
/**
 * Description: TODO
 * @author czStudio
 */
@RestController
@RequestMapping("/composition")
public class TeamCompositionController extends BaseController {
    @Autowired
    private ITeamCompositionService teamCompositionService;

    @GetMapping("/list")
    public AjaxResult list(){
        List<TeamComposition> list = teamCompositionService.list();
        return AjaxResult.success(list);
    }
}
