package com.czStudio.mapper;

import com.czStudio.domain.TeamAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Mapper
public interface TeamAwardMapper {
    List<TeamAward> selectAll();
    List<TeamAward> selectByYear(Integer year);
    List<TeamAward> selectByYearMonth(Integer year,Integer month);
}
