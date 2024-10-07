package com.czStudio.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
@ApiModel("队伍组成实体类")
public class TeamComposition {
    private Integer id;

    private String name;  //姓名

    private String avatar; //头像

    private String contact;  //联系方式

    @ApiModelProperty(value = "人物层级 0老师  1往届队长  2队长  3往届队员 4现任队员")
    private Integer classification;   //人物层级

    private String introduce;     //介绍
    private String jobTitle;      //职称

    private Integer grade;        //年级
}
