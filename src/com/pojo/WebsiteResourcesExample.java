package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class WebsiteResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebsiteResourcesExample() {
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

        public Criteria andWebRcIdIsNull() {
            addCriterion("web_rc_id is null");
            return (Criteria) this;
        }

        public Criteria andWebRcIdIsNotNull() {
            addCriterion("web_rc_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebRcIdEqualTo(Integer value) {
            addCriterion("web_rc_id =", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdNotEqualTo(Integer value) {
            addCriterion("web_rc_id <>", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdGreaterThan(Integer value) {
            addCriterion("web_rc_id >", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_rc_id >=", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdLessThan(Integer value) {
            addCriterion("web_rc_id <", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_rc_id <=", value, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdIn(List<Integer> values) {
            addCriterion("web_rc_id in", values, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdNotIn(List<Integer> values) {
            addCriterion("web_rc_id not in", values, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdBetween(Integer value1, Integer value2) {
            addCriterion("web_rc_id between", value1, value2, "webRcId");
            return (Criteria) this;
        }

        public Criteria andWebRcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_rc_id not between", value1, value2, "webRcId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdIsNull() {
            addCriterion("from_website_id is null");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdIsNotNull() {
            addCriterion("from_website_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdEqualTo(Integer value) {
            addCriterion("from_website_id =", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdNotEqualTo(Integer value) {
            addCriterion("from_website_id <>", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdGreaterThan(Integer value) {
            addCriterion("from_website_id >", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_website_id >=", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdLessThan(Integer value) {
            addCriterion("from_website_id <", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_website_id <=", value, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdIn(List<Integer> values) {
            addCriterion("from_website_id in", values, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdNotIn(List<Integer> values) {
            addCriterion("from_website_id not in", values, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("from_website_id between", value1, value2, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andFromWebsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_website_id not between", value1, value2, "fromWebsiteId");
            return (Criteria) this;
        }

        public Criteria andRcNameIsNull() {
            addCriterion("rc_name is null");
            return (Criteria) this;
        }

        public Criteria andRcNameIsNotNull() {
            addCriterion("rc_name is not null");
            return (Criteria) this;
        }

        public Criteria andRcNameEqualTo(String value) {
            addCriterion("rc_name =", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameNotEqualTo(String value) {
            addCriterion("rc_name <>", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameGreaterThan(String value) {
            addCriterion("rc_name >", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameGreaterThanOrEqualTo(String value) {
            addCriterion("rc_name >=", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameLessThan(String value) {
            addCriterion("rc_name <", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameLessThanOrEqualTo(String value) {
            addCriterion("rc_name <=", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameLike(String value) {
            addCriterion("rc_name like", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameNotLike(String value) {
            addCriterion("rc_name not like", value, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameIn(List<String> values) {
            addCriterion("rc_name in", values, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameNotIn(List<String> values) {
            addCriterion("rc_name not in", values, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameBetween(String value1, String value2) {
            addCriterion("rc_name between", value1, value2, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcNameNotBetween(String value1, String value2) {
            addCriterion("rc_name not between", value1, value2, "rcName");
            return (Criteria) this;
        }

        public Criteria andRcUrlIsNull() {
            addCriterion("rc_url is null");
            return (Criteria) this;
        }

        public Criteria andRcUrlIsNotNull() {
            addCriterion("rc_url is not null");
            return (Criteria) this;
        }

        public Criteria andRcUrlEqualTo(String value) {
            addCriterion("rc_url =", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlNotEqualTo(String value) {
            addCriterion("rc_url <>", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlGreaterThan(String value) {
            addCriterion("rc_url >", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rc_url >=", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlLessThan(String value) {
            addCriterion("rc_url <", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlLessThanOrEqualTo(String value) {
            addCriterion("rc_url <=", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlLike(String value) {
            addCriterion("rc_url like", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlNotLike(String value) {
            addCriterion("rc_url not like", value, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlIn(List<String> values) {
            addCriterion("rc_url in", values, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlNotIn(List<String> values) {
            addCriterion("rc_url not in", values, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlBetween(String value1, String value2) {
            addCriterion("rc_url between", value1, value2, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcUrlNotBetween(String value1, String value2) {
            addCriterion("rc_url not between", value1, value2, "rcUrl");
            return (Criteria) this;
        }

        public Criteria andRcVisitIsNull() {
            addCriterion("rc_visit is null");
            return (Criteria) this;
        }

        public Criteria andRcVisitIsNotNull() {
            addCriterion("rc_visit is not null");
            return (Criteria) this;
        }

        public Criteria andRcVisitEqualTo(Integer value) {
            addCriterion("rc_visit =", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitNotEqualTo(Integer value) {
            addCriterion("rc_visit <>", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitGreaterThan(Integer value) {
            addCriterion("rc_visit >", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("rc_visit >=", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitLessThan(Integer value) {
            addCriterion("rc_visit <", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitLessThanOrEqualTo(Integer value) {
            addCriterion("rc_visit <=", value, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitIn(List<Integer> values) {
            addCriterion("rc_visit in", values, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitNotIn(List<Integer> values) {
            addCriterion("rc_visit not in", values, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitBetween(Integer value1, Integer value2) {
            addCriterion("rc_visit between", value1, value2, "rcVisit");
            return (Criteria) this;
        }

        public Criteria andRcVisitNotBetween(Integer value1, Integer value2) {
            addCriterion("rc_visit not between", value1, value2, "rcVisit");
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