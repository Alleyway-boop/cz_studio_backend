package com.czStudio.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Description: TODO
 *
 * @author czStudio
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("新闻")
public class TeamNews {
    private Integer id;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date publishDatetime;
    private String publisher;
}
