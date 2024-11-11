package com.czStudio.mapper;

import java.util.List;

import com.czStudio.domain.TeamNews;


/**
 * 新闻管理Mapper接口
 * 
 * @author czStudio
 * @date 2024-10-10
 */
/**
 * 新闻管理Mapper接口
 *
 * @author czStudio
 * @date 2024-10-11
 */
public interface TeamNewsMapper
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
     * 删除新闻管理
     *
     * @param id 新闻管理主键
     * @return 结果
     */
    public int deleteTeamNewsById(Long id);

    /**
     * 批量删除新闻管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeamNewsByIds(Long[] ids);
}