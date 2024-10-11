package com.czStudio.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.czStudio.common.annotation.Excel;
import com.czStudio.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Team对象 team_apply
 * 
 * @author czStudio
 * @date 2024-10-11
 */
public class TeamApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 班级 */
    @Excel(name = "班级")
    private String inClass;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 教育背景 0为中职  1为普高   2为其他 */
    @Excel(name = "教育背景 0为中职  1为普高   2为其他")
    private String education;

    /** 性别 true为男 false为女 */
    @Excel(name = "性别 true为男 false为女")
    private String gender;

    /** 家乡 */
    @Excel(name = "家乡")
    private String hometown;

    /** 老学校 */
    @Excel(name = "老学校")
    private String oldSchool;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 计划 */
    @Excel(name = "计划")
    private String plan;

    /** 语言熟练度 */
    @Excel(name = "语言熟练度")
    private String programming;

    /** qq号 */
    @Excel(name = "qq号")
    private String qq;

    /** 留言 */
    @Excel(name = "留言")
    private String remarks;

    /** 报名时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报名时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setInClass(String inClass) 
    {
        this.inClass = inClass;
    }

    public String getInClass() 
    {
        return inClass;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setHometown(String hometown) 
    {
        this.hometown = hometown;
    }

    public String getHometown() 
    {
        return hometown;
    }
    public void setOldSchool(String oldSchool) 
    {
        this.oldSchool = oldSchool;
    }

    public String getOldSchool() 
    {
        return oldSchool;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setPlan(String plan) 
    {
        this.plan = plan;
    }

    public String getPlan() 
    {
        return plan;
    }
    public void setProgramming(String programming) 
    {
        this.programming = programming;
    }

    public String getProgramming() 
    {
        return programming;
    }
    public void setQq(String qq) 
    {
        this.qq = qq;
    }

    public String getQq() 
    {
        return qq;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setApplyTime(Date applyTime) 
    {
        this.applyTime = applyTime;
    }

    public Date getApplyTime() 
    {
        return applyTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("inClass", getInClass())
            .append("birthday", getBirthday())
            .append("education", getEducation())
            .append("gender", getGender())
            .append("hometown", getHometown())
            .append("oldSchool", getOldSchool())
            .append("phone", getPhone())
            .append("plan", getPlan())
            .append("programming", getProgramming())
            .append("qq", getQq())
            .append("remarks", getRemarks())
            .append("applyTime", getApplyTime())
            .toString();
    }
}
