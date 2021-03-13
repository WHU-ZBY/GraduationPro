package com.zby.server01.pojo;

import java.util.Date;

public class TeamMember {
    private Long team_member_id;

    private Long team_id;

    private Long uid;

    private Date create_time;

    public Long getTeam_member_id() {
        return team_member_id;
    }

    public void setTeam_member_id(Long team_member_id) {
        this.team_member_id = team_member_id;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}