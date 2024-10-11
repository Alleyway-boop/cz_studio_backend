package com.czStudio.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.czStudio.mapper.TeamApplyMapper;
import com.czStudio.domain.TeamApply;
import com.czStudio.service.ITeamApplyService;

/**
 * TeamService业务层处理
 * 
 * @author czStudio
 * @date 2024-10-11
 */
@Service
public class TeamApplyServiceImpl implements ITeamApplyService 
{
    @Autowired
    private TeamApplyMapper teamApplyMapper;

    /**
     * 查询Team
     * 
     * @param id Team主键
     * @return Team
     */
    @Override
    public TeamApply selectTeamApplyById(Long id)
    {
        return teamApplyMapper.selectTeamApplyById(id);
    }

    /**
     * 查询Team列表
     * 
     * @param teamApply Team
     * @return Team
     */
    @Override
    public List<TeamApply> selectTeamApplyList(TeamApply teamApply)
    {
        return teamApplyMapper.selectTeamApplyList(teamApply);
    }

    /**
     * 新增Team
     * 
     * @param teamApply Team
     * @return 结果
     */
    @Override
    public int insertTeamApply(TeamApply teamApply)
    {
        return teamApplyMapper.insertTeamApply(teamApply);
    }

    /**
     * 修改Team
     * 
     * @param teamApply Team
     * @return 结果
     */
    @Override
    public int updateTeamApply(TeamApply teamApply)
    {
        return teamApplyMapper.updateTeamApply(teamApply);
    }

    /**
     * 批量删除Team
     * 
     * @param ids 需要删除的Team主键
     * @return 结果
     */
    @Override
    public int deleteTeamApplyByIds(Long[] ids)
    {
        return teamApplyMapper.deleteTeamApplyByIds(ids);
    }

    /**
     * 删除Team信息
     * 
     * @param id Team主键
     * @return 结果
     */
    @Override
    public int deleteTeamApplyById(Long id)
    {
        return teamApplyMapper.deleteTeamApplyById(id);
    }
}
