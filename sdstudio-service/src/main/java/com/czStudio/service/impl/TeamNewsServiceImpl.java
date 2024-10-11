package com.czStudio.service.impl;

import java.util.List;

import com.czStudio.domain.TeamNews;
import com.czStudio.mapper.TeamNewsMapper;
import com.czStudio.service.ITeamNewsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 新闻管理Service业务层处理
 * 
 * @author czStudio
 * @date 2024-10-10
 */
@Service
@Slf4j
public class TeamNewsServiceImpl implements ITeamNewsService
{
    @Autowired
    private TeamNewsMapper teamNewsMapper;

    /**
     * 查询新闻管理
     * 
     * @param id 新闻管理主键
     * @return 新闻管理
     */
    @Override
    public TeamNews selectTeamNewsById(Long id)
    {
        return teamNewsMapper.selectTeamNewsById(id);
    }

    /**
     * 查询新闻管理列表
     * 
     * @param teamNews 新闻管理
     * @return 新闻管理
     */
    @Override
    public List<TeamNews> selectTeamNewsList(TeamNews teamNews)
    {
        log.error("新闻列表：{}", teamNews);
        return teamNewsMapper.selectTeamNewsList(teamNews);
    }

    /**
     * 新增新闻管理
     * 
     * @param teamNews 新闻管理
     * @return 结果
     */
    @Override
    public int insertTeamNews(TeamNews teamNews)
    {

        return teamNewsMapper.insertTeamNews(teamNews);
    }

    /**
     * 修改新闻管理
     * 
     * @param teamNews 新闻管理
     * @return 结果
     */
    @Override
    public int updateTeamNews(TeamNews teamNews)
    {
        return teamNewsMapper.updateTeamNews(teamNews);
    }

    /**
     * 批量删除新闻管理
     * 
     * @param ids 需要删除的新闻管理主键
     * @return 结果
     */
    @Override
    public int deleteTeamNewsByIds(Long[] ids)
    {
        return teamNewsMapper.deleteTeamNewsByIds(ids);
    }

    /**
     * 删除新闻管理信息
     * 
     * @param id 新闻管理主键
     * @return 结果
     */
    @Override
    public int deleteTeamNewsById(Long id)
    {
        return teamNewsMapper.deleteTeamNewsById(id);
    }
}
