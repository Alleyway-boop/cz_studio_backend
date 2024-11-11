package com.czStudio.service;

import java.util.List;
import com.czStudio.domain.TeamApply;

/**
 * TeamService接口
 * 
 * @author czStudio
 * @date 2024-10-11
 */
public interface ITeamApplyService 
{
    /**
     * 查询Team
     * 
     * @param id Team主键
     * @return Team
     */
    public TeamApply selectTeamApplyById(Long id);

    /**
     * 查询Team列表
     * 
     * @param teamApply Team
     * @return Team集合
     */
    public List<TeamApply> selectTeamApplyList(TeamApply teamApply);

    /**
     * 新增Team
     * 
     * @param teamApply Team
     * @return 结果
     */
    public int insertTeamApply(TeamApply teamApply);

    /**
     * 修改Team
     * 
     * @param teamApply Team
     * @return 结果
     */
    public int updateTeamApply(TeamApply teamApply);

    /**
     * 批量删除Team
     * 
     * @param ids 需要删除的Team主键集合
     * @return 结果
     */
    public int deleteTeamApplyByIds(Long[] ids);

    /**
     * 删除Team信息
     * 
     * @param id Team主键
     * @return 结果
     */
    public int deleteTeamApplyById(Long id);
}
