package com.czStudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class TeamCompetition {

    private Integer id;
    private String cover;

    private String title;

    private String content;


    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;
    private String description;
}
