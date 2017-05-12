package com.jonda.team.repository.entity;

import java.util.Date;

/**
 * Created by xiesitao on 2017/5/4.
 */
public class ActivityEntity {

    private Integer id;

    private String name;

    private String masterId;

    private String teamName;

    private Date start;

    private Date end;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ActivityEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", masterId='" + masterId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", remark='" + remark + '\'' +
                '}';
    }
}
