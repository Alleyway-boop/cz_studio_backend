package com.czStudio.service.impl;

import com.czStudio.domain.TeamNews;
import com.czStudio.mapper.TeamNewsMapper;
import com.czStudio.service.ITeamNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Service
public class TeamNewsServiceImpl implements ITeamNewsService {
    @Autowired
   private TeamNewsMapper teamNewsMapper;
    @Override
    public TeamNews listById(Integer id) {
        return teamNewsMapper.selectNewsById(id);
    }
}
