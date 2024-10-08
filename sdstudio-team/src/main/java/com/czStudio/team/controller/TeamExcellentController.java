package com.czStudio.team.controller;

import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.page.TableDataInfo;
import com.czStudio.domain.TeamExcellent;
import com.czStudio.service.ITeamExcellentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@Slf4j
public class TeamExcellentController extends BaseController {
    @Autowired
    private ITeamExcellentService teamExcellentService;

    @GetMapping("/list")
    public TableDataInfo list() {
        try {
            List<TeamExcellent> list = teamExcellentService.list();
            return getDataTable(list);
        } catch (Exception e) {
            // 处理异常，例如记录日志或者返回错误信息
            log.error("获取团队优秀列表失败", e);
            TableDataInfo tableDataInfo = new TableDataInfo();
            tableDataInfo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            tableDataInfo.setMsg("获取团队优秀列表失败");
            return tableDataInfo;
        }
    }


}
