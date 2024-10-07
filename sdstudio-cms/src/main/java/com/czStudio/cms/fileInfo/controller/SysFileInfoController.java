package com.czStudio.cms.fileInfo.controller;

import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;

import com.czStudio.cms.fileInfo.service.ISysFileInfoService;
import com.czStudio.common.annotation.Log;
import com.czStudio.common.core.page.TableDataInfo;
import com.czStudio.common.exception.ServiceException;
import com.czStudio.common.utils.SecurityUtils;
import com.czStudio.framework.web.service.SysPermissionService;
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
import com.czStudio.common.core.controller.BaseController;
import com.czStudio.common.core.domain.AjaxResult;
import com.czStudio.common.enums.BusinessType;
import com.czStudio.cms.fileInfo.domain.SysFileInfo;
import com.czStudio.common.utils.poi.ExcelUtil;

/**
 * 文件管理Controller
 * 
 * @author ruoyi
 * @date 2021-12-29
 */
@RestController
@RequestMapping("/fileInfo")
public class SysFileInfoController extends BaseController
{
    @Autowired
    private ISysFileInfoService sysFileInfoService;

    @Autowired
    private SysPermissionService permissionService;

    /**
     * 查询文件管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysFileInfo sysFileInfo)
    {
        startPage();
        //判断用户权限
        String createBy = sysFileInfo.getCreateBy();
        if (createBy==null&&"".equals(createBy)){
            throw new ServiceException("获取列表createBy参数为空");
        }
        // 角色集合
        Set<String> roles = permissionService.getRolePermission(getLoginUser().getUser());
        if (SecurityUtils.isAdmin(getUserId())||roles.contains("admin")||roles.contains("cms")){
            sysFileInfo.setCreateBy("");
        }
        List<SysFileInfo> list = sysFileInfoService.selectSysFileInfoList(sysFileInfo);
        return getDataTable(list);
    }

    /**
     * 导出文件管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:export')")
    @Log(title = "文件管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysFileInfo sysFileInfo)
    {
        List<SysFileInfo> list = sysFileInfoService.selectSysFileInfoList(sysFileInfo);
        ExcelUtil<SysFileInfo> util = new ExcelUtil<SysFileInfo>(SysFileInfo.class);
        util.exportExcel(response, list, "文件管理数据");
    }

    /**
     * 获取文件管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:query')")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return AjaxResult.success(sysFileInfoService.selectSysFileInfoByFileId(fileId));
    }

    /**
     * 新增文件管理
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:add')")
    @Log(title = "文件管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysFileInfo sysFileInfo)
    {
        return toAjax(sysFileInfoService.insertSysFileInfo(sysFileInfo));
    }

    /**
     * 修改文件管理
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:edit')")
    @Log(title = "文件管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysFileInfo sysFileInfo)
    {
        return toAjax(sysFileInfoService.updateSysFileInfo(sysFileInfo));
    }

    /**
     * 删除文件管理
     */
    @PreAuthorize("@ss.hasPermi('cms:fileInfo:remove')")
    @Log(title = "文件管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(sysFileInfoService.deleteSysFileInfoByFileIds(fileIds));
    }
}
