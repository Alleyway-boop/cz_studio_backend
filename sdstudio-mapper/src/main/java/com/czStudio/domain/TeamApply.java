package com.czStudio.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Accessors(chain = true)
public class TeamApply {

    private Integer id;
    private String name;          //姓名
    private String inClass;       //所在班级
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
    private Date birthday;        //生日
    private String education;    //教育背景
    private String gender;        //性别
    private String hometown;      //家乡
    private String oldSchool;     //旧学校
    private String phone;        //手机号
    private String plan;          //学习计划
    private String programming;   //语言熟练度
    private String qq;            //qq号
    private String remarks;       //留言
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd ",locale="zh", timezone="GMT+8")
    private LocalDateTime applyTime;        //报名时间
}
