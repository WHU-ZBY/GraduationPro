package com.zby.server01.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProject_idIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProject_idIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProject_idEqualTo(Long value) {
            addCriterion("project_id =", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idGreaterThan(Long value) {
            addCriterion("project_id >", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idLessThan(Long value) {
            addCriterion("project_id <", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idIn(List<Long> values) {
            addCriterion("project_id in", values, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "project_id");
            return (Criteria) this;
        }

        public Criteria andProject_idNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "project_id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCraete_timeIsNull() {
            addCriterion("craete_time is null");
            return (Criteria) this;
        }

        public Criteria andCraete_timeIsNotNull() {
            addCriterion("craete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCraete_timeEqualTo(Date value) {
            addCriterion("craete_time =", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeNotEqualTo(Date value) {
            addCriterion("craete_time <>", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeGreaterThan(Date value) {
            addCriterion("craete_time >", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("craete_time >=", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeLessThan(Date value) {
            addCriterion("craete_time <", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeLessThanOrEqualTo(Date value) {
            addCriterion("craete_time <=", value, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeIn(List<Date> values) {
            addCriterion("craete_time in", values, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeNotIn(List<Date> values) {
            addCriterion("craete_time not in", values, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeBetween(Date value1, Date value2) {
            addCriterion("craete_time between", value1, value2, "craete_time");
            return (Criteria) this;
        }

        public Criteria andCraete_timeNotBetween(Date value1, Date value2) {
            addCriterion("craete_time not between", value1, value2, "craete_time");
            return (Criteria) this;
        }

        public Criteria andTeam_idIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeam_idIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeam_idEqualTo(Long value) {
            addCriterion("team_id =", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idNotEqualTo(Long value) {
            addCriterion("team_id <>", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idGreaterThan(Long value) {
            addCriterion("team_id >", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idGreaterThanOrEqualTo(Long value) {
            addCriterion("team_id >=", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idLessThan(Long value) {
            addCriterion("team_id <", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idLessThanOrEqualTo(Long value) {
            addCriterion("team_id <=", value, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idIn(List<Long> values) {
            addCriterion("team_id in", values, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idNotIn(List<Long> values) {
            addCriterion("team_id not in", values, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idBetween(Long value1, Long value2) {
            addCriterion("team_id between", value1, value2, "team_id");
            return (Criteria) this;
        }

        public Criteria andTeam_idNotBetween(Long value1, Long value2) {
            addCriterion("team_id not between", value1, value2, "team_id");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}