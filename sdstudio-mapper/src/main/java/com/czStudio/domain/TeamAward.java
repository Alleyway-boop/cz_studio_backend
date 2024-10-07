package com.czStudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class TeamAward {
    private Integer id;
    private String cover;

    @JsonFormat(pattern = "yyyy-mm", timezone="GMT+8")
    private Date date;
    private String competitionName;
    private String awardLevel;

}
