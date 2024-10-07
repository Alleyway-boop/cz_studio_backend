package com.czStudio.service.impl;

import com.czStudio.domain.TeamAward;
import com.czStudio.mapper.TeamAwardMapper;
import com.czStudio.service.ITeamAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.List;
import java.util.Map;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Service
public class TeamAwardServiceImpl implements ITeamAwardService {
    @Autowired
    private TeamAwardMapper teamAwardMapper;
    @Override
    public List<TeamAward> list() {
        return teamAwardMapper.selectAll();
    }

    @Override
    public List<TeamAward> listByYear(Integer year) {
        return teamAwardMapper.selectByYear(year);
    }

    @Override
    public List<TeamAward> listByYearMonth(Integer year,Integer month) {
        return teamAwardMapper.selectByYearMonth(year,month);
    }
    public Map<YearMonth, List<TeamAward>> getAllTeamAwardsGroupedByYear() {


        return null;
    }
}
