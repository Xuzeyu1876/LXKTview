package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserWeixinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWeixinExample() {
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

        public Criteria andUserWeixinIdIsNull() {
            addCriterion("user_weixin_id is null");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdIsNotNull() {
            addCriterion("user_weixin_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdEqualTo(Integer value) {
            addCriterion("user_weixin_id =", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdNotEqualTo(Integer value) {
            addCriterion("user_weixin_id <>", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdGreaterThan(Integer value) {
            addCriterion("user_weixin_id >", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_weixin_id >=", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdLessThan(Integer value) {
            addCriterion("user_weixin_id <", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_weixin_id <=", value, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdIn(List<Integer> values) {
            addCriterion("user_weixin_id in", values, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdNotIn(List<Integer> values) {
            addCriterion("user_weixin_id not in", values, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdBetween(Integer value1, Integer value2) {
            addCriterion("user_weixin_id between", value1, value2, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andUserWeixinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_weixin_id not between", value1, value2, "userWeixinId");
            return (Criteria) this;
        }

        public Criteria andWxNumberIsNull() {
            addCriterion("wx_number is null");
            return (Criteria) this;
        }

        public Criteria andWxNumberIsNotNull() {
            addCriterion("wx_number is not null");
            return (Criteria) this;
        }

        public Criteria andWxNumberEqualTo(String value) {
            addCriterion("wx_number =", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotEqualTo(String value) {
            addCriterion("wx_number <>", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberGreaterThan(String value) {
            addCriterion("wx_number >", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("wx_number >=", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLessThan(String value) {
            addCriterion("wx_number <", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLessThanOrEqualTo(String value) {
            addCriterion("wx_number <=", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberLike(String value) {
            addCriterion("wx_number like", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotLike(String value) {
            addCriterion("wx_number not like", value, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberIn(List<String> values) {
            addCriterion("wx_number in", values, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotIn(List<String> values) {
            addCriterion("wx_number not in", values, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberBetween(String value1, String value2) {
            addCriterion("wx_number between", value1, value2, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxNumberNotBetween(String value1, String value2) {
            addCriterion("wx_number not between", value1, value2, "wxNumber");
            return (Criteria) this;
        }

        public Criteria andWxImageIsNull() {
            addCriterion("wx_image is null");
            return (Criteria) this;
        }

        public Criteria andWxImageIsNotNull() {
            addCriterion("wx_image is not null");
            return (Criteria) this;
        }

        public Criteria andWxImageEqualTo(String value) {
            addCriterion("wx_image =", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageNotEqualTo(String value) {
            addCriterion("wx_image <>", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageGreaterThan(String value) {
            addCriterion("wx_image >", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageGreaterThanOrEqualTo(String value) {
            addCriterion("wx_image >=", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageLessThan(String value) {
            addCriterion("wx_image <", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageLessThanOrEqualTo(String value) {
            addCriterion("wx_image <=", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageLike(String value) {
            addCriterion("wx_image like", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageNotLike(String value) {
            addCriterion("wx_image not like", value, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageIn(List<String> values) {
            addCriterion("wx_image in", values, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageNotIn(List<String> values) {
            addCriterion("wx_image not in", values, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageBetween(String value1, String value2) {
            addCriterion("wx_image between", value1, value2, "wxImage");
            return (Criteria) this;
        }

        public Criteria andWxImageNotBetween(String value1, String value2) {
            addCriterion("wx_image not between", value1, value2, "wxImage");
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