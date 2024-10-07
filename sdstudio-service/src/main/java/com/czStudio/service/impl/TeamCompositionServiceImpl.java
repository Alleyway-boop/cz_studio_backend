package com.czStudio.service.impl;

import com.czStudio.domain.TeamComposition;
import com.czStudio.mapper.TeamCompositionMapper;
import com.czStudio.service.ITeamCompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Service
public class TeamCompositionServiceImpl implements ITeamCompositionService {
    @Autowired
    private TeamCompositionMapper teamCompositionMapper;

    @Override
    public List<TeamComposition> list() {
        return teamCompositionMapper.selectTeamList();
    }
}
