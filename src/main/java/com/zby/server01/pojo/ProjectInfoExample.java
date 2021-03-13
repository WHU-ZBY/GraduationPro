package com.zby.server01.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
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

        public Criteria andProject_info_idIsNull() {
            addCriterion("project_info_id is null");
            return (Criteria) this;
        }

        public Criteria andProject_info_idIsNotNull() {
            addCriterion("project_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andProject_info_idEqualTo(Long value) {
            addCriterion("project_info_id =", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idNotEqualTo(Long value) {
            addCriterion("project_info_id <>", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idGreaterThan(Long value) {
            addCriterion("project_info_id >", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idGreaterThanOrEqualTo(Long value) {
            addCriterion("project_info_id >=", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idLessThan(Long value) {
            addCriterion("project_info_id <", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idLessThanOrEqualTo(Long value) {
            addCriterion("project_info_id <=", value, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idIn(List<Long> values) {
            addCriterion("project_info_id in", values, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idNotIn(List<Long> values) {
            addCriterion("project_info_id not in", values, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idBetween(Long value1, Long value2) {
            addCriterion("project_info_id between", value1, value2, "project_info_id");
            return (Criteria) this;
        }

        public Criteria andProject_info_idNotBetween(Long value1, Long value2) {
            addCriterion("project_info_id not between", value1, value2, "project_info_id");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSum_finishIsNull() {
            addCriterion("sum_finish is null");
            return (Criteria) this;
        }

        public Criteria andSum_finishIsNotNull() {
            addCriterion("sum_finish is not null");
            return (Criteria) this;
        }

        public Criteria andSum_finishEqualTo(Integer value) {
            addCriterion("sum_finish =", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishNotEqualTo(Integer value) {
            addCriterion("sum_finish <>", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishGreaterThan(Integer value) {
            addCriterion("sum_finish >", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_finish >=", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishLessThan(Integer value) {
            addCriterion("sum_finish <", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishLessThanOrEqualTo(Integer value) {
            addCriterion("sum_finish <=", value, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishIn(List<Integer> values) {
            addCriterion("sum_finish in", values, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishNotIn(List<Integer> values) {
            addCriterion("sum_finish not in", values, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishBetween(Integer value1, Integer value2) {
            addCriterion("sum_finish between", value1, value2, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_finishNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_finish not between", value1, value2, "sum_finish");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingIsNull() {
            addCriterion("sum_ongoing is null");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingIsNotNull() {
            addCriterion("sum_ongoing is not null");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingEqualTo(Integer value) {
            addCriterion("sum_ongoing =", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingNotEqualTo(Integer value) {
            addCriterion("sum_ongoing <>", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingGreaterThan(Integer value) {
            addCriterion("sum_ongoing >", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_ongoing >=", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingLessThan(Integer value) {
            addCriterion("sum_ongoing <", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingLessThanOrEqualTo(Integer value) {
            addCriterion("sum_ongoing <=", value, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingIn(List<Integer> values) {
            addCriterion("sum_ongoing in", values, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingNotIn(List<Integer> values) {
            addCriterion("sum_ongoing not in", values, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingBetween(Integer value1, Integer value2) {
            addCriterion("sum_ongoing between", value1, value2, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_ongoingNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_ongoing not between", value1, value2, "sum_ongoing");
            return (Criteria) this;
        }

        public Criteria andSum_unstartIsNull() {
            addCriterion("sum_unstart is null");
            return (Criteria) this;
        }

        public Criteria andSum_unstartIsNotNull() {
            addCriterion("sum_unstart is not null");
            return (Criteria) this;
        }

        public Criteria andSum_unstartEqualTo(Integer value) {
            addCriterion("sum_unstart =", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartNotEqualTo(Integer value) {
            addCriterion("sum_unstart <>", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartGreaterThan(Integer value) {
            addCriterion("sum_unstart >", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_unstart >=", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartLessThan(Integer value) {
            addCriterion("sum_unstart <", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartLessThanOrEqualTo(Integer value) {
            addCriterion("sum_unstart <=", value, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartIn(List<Integer> values) {
            addCriterion("sum_unstart in", values, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartNotIn(List<Integer> values) {
            addCriterion("sum_unstart not in", values, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartBetween(Integer value1, Integer value2) {
            addCriterion("sum_unstart between", value1, value2, "sum_unstart");
            return (Criteria) this;
        }

        public Criteria andSum_unstartNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_unstart not between", value1, value2, "sum_unstart");
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