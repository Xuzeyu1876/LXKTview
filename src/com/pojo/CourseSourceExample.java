package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseSourceExample() {
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

        public Criteria andSourceIdIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "sourceId");
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

        public Criteria andSouNameIsNull() {
            addCriterion("sou_name is null");
            return (Criteria) this;
        }

        public Criteria andSouNameIsNotNull() {
            addCriterion("sou_name is not null");
            return (Criteria) this;
        }

        public Criteria andSouNameEqualTo(String value) {
            addCriterion("sou_name =", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameNotEqualTo(String value) {
            addCriterion("sou_name <>", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameGreaterThan(String value) {
            addCriterion("sou_name >", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameGreaterThanOrEqualTo(String value) {
            addCriterion("sou_name >=", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameLessThan(String value) {
            addCriterion("sou_name <", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameLessThanOrEqualTo(String value) {
            addCriterion("sou_name <=", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameLike(String value) {
            addCriterion("sou_name like", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameNotLike(String value) {
            addCriterion("sou_name not like", value, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameIn(List<String> values) {
            addCriterion("sou_name in", values, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameNotIn(List<String> values) {
            addCriterion("sou_name not in", values, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameBetween(String value1, String value2) {
            addCriterion("sou_name between", value1, value2, "souName");
            return (Criteria) this;
        }

        public Criteria andSouNameNotBetween(String value1, String value2) {
            addCriterion("sou_name not between", value1, value2, "souName");
            return (Criteria) this;
        }

        public Criteria andSouTypeIsNull() {
            addCriterion("sou_type is null");
            return (Criteria) this;
        }

        public Criteria andSouTypeIsNotNull() {
            addCriterion("sou_type is not null");
            return (Criteria) this;
        }

        public Criteria andSouTypeEqualTo(Integer value) {
            addCriterion("sou_type =", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeNotEqualTo(Integer value) {
            addCriterion("sou_type <>", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeGreaterThan(Integer value) {
            addCriterion("sou_type >", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sou_type >=", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeLessThan(Integer value) {
            addCriterion("sou_type <", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sou_type <=", value, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeIn(List<Integer> values) {
            addCriterion("sou_type in", values, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeNotIn(List<Integer> values) {
            addCriterion("sou_type not in", values, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeBetween(Integer value1, Integer value2) {
            addCriterion("sou_type between", value1, value2, "souType");
            return (Criteria) this;
        }

        public Criteria andSouTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sou_type not between", value1, value2, "souType");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumIsNull() {
            addCriterion("sou_Dload_num is null");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumIsNotNull() {
            addCriterion("sou_Dload_num is not null");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumEqualTo(Integer value) {
            addCriterion("sou_Dload_num =", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumNotEqualTo(Integer value) {
            addCriterion("sou_Dload_num <>", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumGreaterThan(Integer value) {
            addCriterion("sou_Dload_num >", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sou_Dload_num >=", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumLessThan(Integer value) {
            addCriterion("sou_Dload_num <", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("sou_Dload_num <=", value, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumIn(List<Integer> values) {
            addCriterion("sou_Dload_num in", values, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumNotIn(List<Integer> values) {
            addCriterion("sou_Dload_num not in", values, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumBetween(Integer value1, Integer value2) {
            addCriterion("sou_Dload_num between", value1, value2, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouDloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sou_Dload_num not between", value1, value2, "souDloadNum");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeIsNull() {
            addCriterion("sou_Uload_time is null");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeIsNotNull() {
            addCriterion("sou_Uload_time is not null");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeEqualTo(Date value) {
            addCriterion("sou_Uload_time =", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeNotEqualTo(Date value) {
            addCriterion("sou_Uload_time <>", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeGreaterThan(Date value) {
            addCriterion("sou_Uload_time >", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sou_Uload_time >=", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeLessThan(Date value) {
            addCriterion("sou_Uload_time <", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeLessThanOrEqualTo(Date value) {
            addCriterion("sou_Uload_time <=", value, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeIn(List<Date> values) {
            addCriterion("sou_Uload_time in", values, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeNotIn(List<Date> values) {
            addCriterion("sou_Uload_time not in", values, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeBetween(Date value1, Date value2) {
            addCriterion("sou_Uload_time between", value1, value2, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUloadTimeNotBetween(Date value1, Date value2) {
            addCriterion("sou_Uload_time not between", value1, value2, "souUloadTime");
            return (Criteria) this;
        }

        public Criteria andSouUrlIsNull() {
            addCriterion("sou_url is null");
            return (Criteria) this;
        }

        public Criteria andSouUrlIsNotNull() {
            addCriterion("sou_url is not null");
            return (Criteria) this;
        }

        public Criteria andSouUrlEqualTo(String value) {
            addCriterion("sou_url =", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlNotEqualTo(String value) {
            addCriterion("sou_url <>", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlGreaterThan(String value) {
            addCriterion("sou_url >", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sou_url >=", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlLessThan(String value) {
            addCriterion("sou_url <", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlLessThanOrEqualTo(String value) {
            addCriterion("sou_url <=", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlLike(String value) {
            addCriterion("sou_url like", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlNotLike(String value) {
            addCriterion("sou_url not like", value, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlIn(List<String> values) {
            addCriterion("sou_url in", values, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlNotIn(List<String> values) {
            addCriterion("sou_url not in", values, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlBetween(String value1, String value2) {
            addCriterion("sou_url between", value1, value2, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouUrlNotBetween(String value1, String value2) {
            addCriterion("sou_url not between", value1, value2, "souUrl");
            return (Criteria) this;
        }

        public Criteria andSouStatusIsNull() {
            addCriterion("sou_status is null");
            return (Criteria) this;
        }

        public Criteria andSouStatusIsNotNull() {
            addCriterion("sou_status is not null");
            return (Criteria) this;
        }

        public Criteria andSouStatusEqualTo(Integer value) {
            addCriterion("sou_status =", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusNotEqualTo(Integer value) {
            addCriterion("sou_status <>", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusGreaterThan(Integer value) {
            addCriterion("sou_status >", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sou_status >=", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusLessThan(Integer value) {
            addCriterion("sou_status <", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sou_status <=", value, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusIn(List<Integer> values) {
            addCriterion("sou_status in", values, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusNotIn(List<Integer> values) {
            addCriterion("sou_status not in", values, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusBetween(Integer value1, Integer value2) {
            addCriterion("sou_status between", value1, value2, "souStatus");
            return (Criteria) this;
        }

        public Criteria andSouStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sou_status not between", value1, value2, "souStatus");
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