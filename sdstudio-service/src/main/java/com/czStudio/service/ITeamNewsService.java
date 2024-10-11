package com.czStudio.service;

import com.czStudio.domain.TeamNews;

import java.util.List;

/**
 * 新闻管理Service接口
 * 
 * @author czStudio
 * @date 2024-10-10
 */
public interface ITeamNewsService 
{
    /**
     * 查询新闻管理
     * 
     * @param id 新闻管理主键
     * @return 新闻管理
     */
    public TeamNews selectTeamNewsById(Long id);

    /**
     * 查询新闻管理列表
     * 
     * @param teamNews 新闻管理
     * @return 新闻管理集合
     */
    public List<TeamNews> selectTeamNewsList(TeamNews teamNews);

    /**
     * 新增新闻管理
     * 
     * @param teamNews 新闻管理
     * @return 结果
     */
    public int insertTeamNews(TeamNews teamNews);

    /**
     * 修改新闻管理
     * 
     * @param teamNews 新闻管理
     * @return 结果
     */
    public int updateTeamNews(TeamNews teamNews);

    /**
     * 批量删除新闻管理
     * 
     * @param ids 需要删除的新闻管理主键集合
     * @return 结果
     */
    public int deleteTeamNewsByIds(Long[] ids);

    /**
     * 删除新闻管理信息
     * 
     * @param id 新闻管理主键
     * @return 结果
     */
    public int deleteTeamNewsById(Long id);
}
