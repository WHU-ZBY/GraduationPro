package com.zby.server01.pojo;

import java.util.Date;

public class Project {
    private Long project_id;

    private Long uid;

    private String name;

    private Date craete_time;

    private Long team_id;

    private String info;

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCraete_time() {
        return craete_time;
    }

    public void setCraete_time(Date craete_time) {
        this.craete_time = craete_time;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}