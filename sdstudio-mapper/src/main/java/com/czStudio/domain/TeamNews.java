package com.czStudio.domain;

import java.util.Date;

import com.czStudio.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.czStudio.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 新闻管理对象 team_news
 * 
 * @author czStudio
 * @date 2024-10-10
 */
public class TeamNews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** Id */
    private Long id;

    /** 新闻标题
 */
    @Excel(name = "新闻标题 ")
    private String title;

    /** 内容 */
    private String content;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishDatetime;

    /** 发布者 */
    @Excel(name = "发布者")
    private String publisher;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setPublishDatetime(Date publishDatetime) 
    {
        this.publishDatetime = publishDatetime;
    }

    public Date getPublishDatetime() 
    {
        return publishDatetime;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("publishDatetime", getPublishDatetime())
            .append("publisher", getPublisher())
            .toString();
    }
}
