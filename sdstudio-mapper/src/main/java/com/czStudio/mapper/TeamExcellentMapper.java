package com.czStudio.mapper;

import com.czStudio.domain.TeamExcellent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Description: TODO
 *
 * @author czStudio
 */
@Mapper
public interface TeamExcellentMapper {
    List<TeamExcellent> selectExcellentAll();
}
