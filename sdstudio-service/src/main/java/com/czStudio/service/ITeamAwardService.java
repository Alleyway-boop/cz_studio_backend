package com.czStudio.service;

import com.czStudio.domain.TeamAward;

import java.time.YearMonth;
import java.util.List;
import java.util.Map;

/**
 * Description: TODO
 *
 * @author czStudio
 */
public interface ITeamAwardService {

    List<TeamAward> list();
    List<TeamAward> listByYear(Integer year);
    List<TeamAward> listByYearMonth(Integer year,Integer month);
    public Map<YearMonth, List<TeamAward>> getAllTeamAwardsGroupedByYear();

}
