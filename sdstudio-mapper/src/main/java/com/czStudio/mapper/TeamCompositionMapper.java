package com.czStudio.mapper;

import com.czStudio.domain.TeamComposition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Mapper
public interface TeamCompositionMapper {
    List<TeamComposition> selectTeamList();

}
