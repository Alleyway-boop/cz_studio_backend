package com.czStudio.service.impl;

import com.czStudio.domain.TeamExcellent;
import com.czStudio.mapper.TeamExcellentMapper;
import com.czStudio.service.ITeamExcellentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Service
public class TeamExcellentServiceImpl implements ITeamExcellentService {
    @Autowired
    private TeamExcellentMapper teamExcellentMapper;


    @Override
    public List<TeamExcellent> list() {

        return teamExcellentMapper.selectExcellentAll();
    }
}
