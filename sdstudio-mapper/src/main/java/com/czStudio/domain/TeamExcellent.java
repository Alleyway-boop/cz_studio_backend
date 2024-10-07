package com.czStudio.domain;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Description: TODO
 * @author czStudio
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("优秀毕业生")
public class TeamExcellent {

    private Integer id;
    private String cover;     //学生封面头像
    private String name;      //姓名
    private String introduce;  //介绍
    private String intro;      //简介
    private String teamId;

}
