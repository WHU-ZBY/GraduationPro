package com.zby.server01.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamMemberExample() {
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

        public Criteria andTeam_member_idIsNull() {
            addCriterion("team_member_id is null");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idIsNotNull() {
            addCriterion("team_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idEqualTo(Long value) {
            addCriterion("team_member_id =", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idNotEqualTo(Long value) {
            addCriterion("team_member_id <>", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idGreaterThan(Long value) {
            addCriterion("team_member_id >", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idGreaterThanOrEqualTo(Long value) {
            addCriterion("team_member_id >=", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idLessThan(Long value) {
            addCriterion("team_member_id <", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idLessThanOrEqualTo(Long value) {
            addCriterion("team_member_id <=", value, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idIn(List<Long> values) {
            addCriterion("team_member_id in", values, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idNotIn(List<Long> values) {
            addCriterion("team_member_id not in", values, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idBetween(Long value1, Long value2) {
            addCriterion("team_member_id between", value1, value2, "team_member_id");
            return (Criteria) this;
        }

        public Criteria andTeam_member_idNotBetween(Long value1, Long value2) {
            addCriterion("team_member_id not between", value1, value2, "team_member_id");
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

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
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