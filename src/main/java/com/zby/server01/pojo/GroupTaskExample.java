package com.zby.server01.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupTaskExample() {
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

        public Criteria andGroup_task_idIsNull() {
            addCriterion("group_task_id is null");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idIsNotNull() {
            addCriterion("group_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idEqualTo(Long value) {
            addCriterion("group_task_id =", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idNotEqualTo(Long value) {
            addCriterion("group_task_id <>", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idGreaterThan(Long value) {
            addCriterion("group_task_id >", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idGreaterThanOrEqualTo(Long value) {
            addCriterion("group_task_id >=", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idLessThan(Long value) {
            addCriterion("group_task_id <", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idLessThanOrEqualTo(Long value) {
            addCriterion("group_task_id <=", value, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idIn(List<Long> values) {
            addCriterion("group_task_id in", values, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idNotIn(List<Long> values) {
            addCriterion("group_task_id not in", values, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idBetween(Long value1, Long value2) {
            addCriterion("group_task_id between", value1, value2, "group_task_id");
            return (Criteria) this;
        }

        public Criteria andGroup_task_idNotBetween(Long value1, Long value2) {
            addCriterion("group_task_id not between", value1, value2, "group_task_id");
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

        public Criteria andTask_idIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTask_idIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTask_idEqualTo(Long value) {
            addCriterion("task_id =", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThan(Long value) {
            addCriterion("task_id >", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThan(Long value) {
            addCriterion("task_id <", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idIn(List<Long> values) {
            addCriterion("task_id in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "task_id");
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