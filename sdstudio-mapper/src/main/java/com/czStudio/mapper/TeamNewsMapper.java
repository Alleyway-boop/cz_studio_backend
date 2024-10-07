package com.czStudio.mapper;

import com.czStudio.domain.TeamNews;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Mapper
public interface TeamNewsMapper {
    TeamNews selectNewsById(Integer id);
}
