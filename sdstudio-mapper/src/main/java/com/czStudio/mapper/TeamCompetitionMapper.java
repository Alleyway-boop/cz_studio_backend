package com.czStudio.mapper;

import com.czStudio.domain.TeamCompetition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Mapper
public interface TeamCompetitionMapper {

    List<TeamCompetition> selectCompetitionAll();
    TeamCompetition selectCompetitionById(Integer id);
}
