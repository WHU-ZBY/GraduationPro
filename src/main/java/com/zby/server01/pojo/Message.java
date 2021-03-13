package com.zby.server01.pojo;

import java.util.Date;

public class Message {
    private Long message_id;

    private Long uid;

    private Long to_uid;

    private String content;

    private Date create_time;

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getTo_uid() {
        return to_uid;
    }

    public void setTo_uid(Long to_uid) {
        this.to_uid = to_uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}