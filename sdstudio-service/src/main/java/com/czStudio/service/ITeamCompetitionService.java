package com.czStudio.service;

import com.czStudio.domain.TeamCompetition;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
public interface ITeamCompetitionService {

    List<TeamCompetition> list();
    TeamCompetition listById(Integer id);
}
