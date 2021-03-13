package com.zby.server01.pojo;

import java.util.Date;

public class SysLog {
    private Long sys_log_id;

    private Date create_time;

    private Boolean state;

    private String content;

    public Long getSys_log_id() {
        return sys_log_id;
    }

    public void setSys_log_id(Long sys_log_id) {
        this.sys_log_id = sys_log_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}