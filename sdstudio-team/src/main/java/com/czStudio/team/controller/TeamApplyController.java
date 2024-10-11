package com.czStudio.team.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.czStudio.common.annotation.Log;
import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.common.enums.BusinessType;
import com.czStudio.domain.TeamApply;
import com.czStudio.service.ITeamApplyService;
import com.czStudio.common.utils.poi.ExcelUtil;
import com.czStudio.common.core.page.TableDataInfo;

/**
 * TeamController
 * 
 * @author czStudio
 * @date 2024-10-11
 */
@RestController
@RequestMapping("/team/apply")
public class TeamApplyController extends BaseController
{
    @Autowired
    private ITeamApplyService teamApplyService;

    /**
     * 查询Team列表
     */
    @PreAuthorize("@ss.hasPermi('team:apply:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeamApply teamApply)
    {
        startPage();
        List<TeamApply> list = teamApplyService.selectTeamApplyList(teamApply);
        return getDataTable(list);
    }

    /**
     * 导出Team列表
     */
    @PreAuthorize("@ss.hasPermi('team:apply:export')")
    @Log(title = "Team", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeamApply teamApply)
    {
        List<TeamApply> list = teamApplyService.selectTeamApplyList(teamApply);
        ExcelUtil<TeamApply> util = new ExcelUtil<TeamApply>(TeamApply.class);
        util.exportExcel(response, list, "Team数据");
    }

    /**
     * 获取Team详细信息
     */
    @PreAuthorize("@ss.hasPermi('team:apply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(teamApplyService.selectTeamApplyById(id));
    }

    /**
     * 新增Team
     */
    @PreAuthorize("@ss.hasPermi('team:apply:add')")
    @Log(title = "Team", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeamApply teamApply)
    {
        return toAjax(teamApplyService.insertTeamApply(teamApply));
    }

    /**
     * 修改Team
     */
    @PreAuthorize("@ss.hasPermi('team:apply:edit')")
    @Log(title = "Team", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeamApply teamApply)
    {
        return toAjax(teamApplyService.updateTeamApply(teamApply));
    }

    /**
     * 删除Team
     */
    @PreAuthorize("@ss.hasPermi('team:apply:remove')")
    @Log(title = "Team", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(teamApplyService.deleteTeamApplyByIds(ids));
    }
}
