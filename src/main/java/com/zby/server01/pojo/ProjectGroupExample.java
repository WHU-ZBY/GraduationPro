package com.zby.server01.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectGroupExample() {
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

        public Criteria andProject_group_idIsNull() {
            addCriterion("project_group_id is null");
            return (Criteria) this;
        }

        public Criteria andProject_group_idIsNotNull() {
            addCriterion("project_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andProject_group_idEqualTo(Long value) {
            addCriterion("project_group_id =", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idNotEqualTo(Long value) {
            addCriterion("project_group_id <>", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idGreaterThan(Long value) {
            addCriterion("project_group_id >", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idGreaterThanOrEqualTo(Long value) {
            addCriterion("project_group_id >=", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idLessThan(Long value) {
            addCriterion("project_group_id <", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idLessThanOrEqualTo(Long value) {
            addCriterion("project_group_id <=", value, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idIn(List<Long> values) {
            addCriterion("project_group_id in", values, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idNotIn(List<Long> values) {
            addCriterion("project_group_id not in", values, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idBetween(Long value1, Long value2) {
            addCriterion("project_group_id between", value1, value2, "project_group_id");
            return (Criteria) this;
        }

        public Criteria andProject_group_idNotBetween(Long value1, Long value2) {
            addCriterion("project_group_id not between", value1, value2, "project_group_id");
            return (Criteria) this;
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

        public Criteria andGroup_idIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroup_idIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_idEqualTo(Long value) {
            addCriterion("group_id =", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idGreaterThan(Long value) {
            addCriterion("group_id >", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idLessThan(Long value) {
            addCriterion("group_id <", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idIn(List<Long> values) {
            addCriterion("group_id in", values, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "group_id");
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