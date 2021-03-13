package com.zby.server01.pojo;

public class ProjectInfo {
    private Long project_info_id;

    private Long project_id;

    private Integer state;

    private Integer sum_finish;

    private Integer sum_ongoing;

    private Integer sum_unstart;

    public Long getProject_info_id() {
        return project_info_id;
    }

    public void setProject_info_id(Long project_info_id) {
        this.project_info_id = project_info_id;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSum_finish() {
        return sum_finish;
    }

    public void setSum_finish(Integer sum_finish) {
        this.sum_finish = sum_finish;
    }

    public Integer getSum_ongoing() {
        return sum_ongoing;
    }

    public void setSum_ongoing(Integer sum_ongoing) {
        this.sum_ongoing = sum_ongoing;
    }

    public Integer getSum_unstart() {
        return sum_unstart;
    }

    public void setSum_unstart(Integer sum_unstart) {
        this.sum_unstart = sum_unstart;
    }
}