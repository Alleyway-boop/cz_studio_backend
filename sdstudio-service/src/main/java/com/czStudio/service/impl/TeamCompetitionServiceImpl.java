package com.czStudio.service.impl;

import com.czStudio.domain.TeamCompetition;
import com.czStudio.mapper.TeamCompetitionMapper;
import com.czStudio.service.ITeamCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Service
public class TeamCompetitionServiceImpl implements ITeamCompetitionService {
    @Autowired
    private TeamCompetitionMapper teamCompetitionMapper;

    @Override
    public List<TeamCompetition> list() {
        return teamCompetitionMapper.selectCompetitionAll();
    }

    @Override
    public TeamCompetition listById(Integer id) {
        return teamCompetitionMapper.selectCompetitionById(id);
    }
}
