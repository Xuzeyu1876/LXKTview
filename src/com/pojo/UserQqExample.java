package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserQqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserQqExample() {
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

        public Criteria andUserQqIdIsNull() {
            addCriterion("user_qq_id is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIdIsNotNull() {
            addCriterion("user_qq_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqIdEqualTo(Integer value) {
            addCriterion("user_qq_id =", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdNotEqualTo(Integer value) {
            addCriterion("user_qq_id <>", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdGreaterThan(Integer value) {
            addCriterion("user_qq_id >", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_qq_id >=", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdLessThan(Integer value) {
            addCriterion("user_qq_id <", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_qq_id <=", value, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdIn(List<Integer> values) {
            addCriterion("user_qq_id in", values, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdNotIn(List<Integer> values) {
            addCriterion("user_qq_id not in", values, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdBetween(Integer value1, Integer value2) {
            addCriterion("user_qq_id between", value1, value2, "userQqId");
            return (Criteria) this;
        }

        public Criteria andUserQqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_qq_id not between", value1, value2, "userQqId");
            return (Criteria) this;
        }

        public Criteria andQqNumberIsNull() {
            addCriterion("qq_number is null");
            return (Criteria) this;
        }

        public Criteria andQqNumberIsNotNull() {
            addCriterion("qq_number is not null");
            return (Criteria) this;
        }

        public Criteria andQqNumberEqualTo(Integer value) {
            addCriterion("qq_number =", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotEqualTo(Integer value) {
            addCriterion("qq_number <>", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberGreaterThan(Integer value) {
            addCriterion("qq_number >", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("qq_number >=", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberLessThan(Integer value) {
            addCriterion("qq_number <", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberLessThanOrEqualTo(Integer value) {
            addCriterion("qq_number <=", value, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberIn(List<Integer> values) {
            addCriterion("qq_number in", values, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotIn(List<Integer> values) {
            addCriterion("qq_number not in", values, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberBetween(Integer value1, Integer value2) {
            addCriterion("qq_number between", value1, value2, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("qq_number not between", value1, value2, "qqNumber");
            return (Criteria) this;
        }

        public Criteria andQqImageIsNull() {
            addCriterion("qq_image is null");
            return (Criteria) this;
        }

        public Criteria andQqImageIsNotNull() {
            addCriterion("qq_image is not null");
            return (Criteria) this;
        }

        public Criteria andQqImageEqualTo(String value) {
            addCriterion("qq_image =", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageNotEqualTo(String value) {
            addCriterion("qq_image <>", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageGreaterThan(String value) {
            addCriterion("qq_image >", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageGreaterThanOrEqualTo(String value) {
            addCriterion("qq_image >=", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageLessThan(String value) {
            addCriterion("qq_image <", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageLessThanOrEqualTo(String value) {
            addCriterion("qq_image <=", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageLike(String value) {
            addCriterion("qq_image like", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageNotLike(String value) {
            addCriterion("qq_image not like", value, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageIn(List<String> values) {
            addCriterion("qq_image in", values, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageNotIn(List<String> values) {
            addCriterion("qq_image not in", values, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageBetween(String value1, String value2) {
            addCriterion("qq_image between", value1, value2, "qqImage");
            return (Criteria) this;
        }

        public Criteria andQqImageNotBetween(String value1, String value2) {
            addCriterion("qq_image not between", value1, value2, "qqImage");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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