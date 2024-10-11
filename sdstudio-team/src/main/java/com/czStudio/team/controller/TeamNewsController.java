package com.czStudio.team.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.czStudio.domain.TeamNews;
import com.czStudio.service.ITeamNewsService;
import com.czStudio.service.impl.TeamNewsServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
import com.czStudio.common.utils.poi.ExcelUtil;
import com.czStudio.common.core.page.TableDataInfo;

/**
 * 新闻管理Controller
 * 
 * @author czStudio
 * @date 2024-10-10
 */
@RestController
@RequestMapping("/team/news")
@Slf4j
public class TeamNewsController extends BaseController
{
    @Autowired
    private TeamNewsServiceImpl teamNewsService;

    /**
     * 查询新闻管理列表
     */
    @PreAuthorize("@ss.hasPermi('team:news:list')")
    @GetMapping("/list")
    public TableDataInfo list(TeamNews teamNews)
    {
        startPage();
        List<TeamNews> list = teamNewsService.selectTeamNewsList(teamNews);
        logger.error("新闻列表：{}", list);
        return getDataTable(list);
    }

    /**
     * 导出新闻管理列表
     */
    @PreAuthorize("@ss.hasPermi('team:news:export')")
    @Log(title = "新闻管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TeamNews teamNews)
    {
        List<TeamNews> list = teamNewsService.selectTeamNewsList(teamNews);
        ExcelUtil<TeamNews> util = new ExcelUtil<TeamNews>(TeamNews.class);
        util.exportExcel(response, list, "新闻管理数据");
    }

    /**
     * 获取新闻管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('team:news:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(teamNewsService.selectTeamNewsById(id));
    }

    /**
     * 新增新闻管理
     */
    @PreAuthorize("@ss.hasPermi('team:news:add')")
    @Log(title = "新闻管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TeamNews teamNews)
    {
        return toAjax(teamNewsService.insertTeamNews(teamNews));
    }

    /**
     * 修改新闻管理
     */
    @PreAuthorize("@ss.hasPermi('team:news:edit')")
    @Log(title = "新闻管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TeamNews teamNews)
    {
        return toAjax(teamNewsService.updateTeamNews(teamNews));
    }

    /**
     * 删除新闻管理
     */
    @PreAuthorize("@ss.hasPermi('team:news:remove')")
    @Log(title = "新闻管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(teamNewsService.deleteTeamNewsByIds(ids));
    }
}
