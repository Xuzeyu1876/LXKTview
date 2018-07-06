package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCouIdIsNull() {
            addCriterion("cou_id is null");
            return (Criteria) this;
        }

        public Criteria andCouIdIsNotNull() {
            addCriterion("cou_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouIdEqualTo(Integer value) {
            addCriterion("cou_id =", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotEqualTo(Integer value) {
            addCriterion("cou_id <>", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThan(Integer value) {
            addCriterion("cou_id >", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_id >=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThan(Integer value) {
            addCriterion("cou_id <", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThanOrEqualTo(Integer value) {
            addCriterion("cou_id <=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdIn(List<Integer> values) {
            addCriterion("cou_id in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotIn(List<Integer> values) {
            addCriterion("cou_id not in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdBetween(Integer value1, Integer value2) {
            addCriterion("cou_id between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_id not between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNull() {
            addCriterion("cou_name is null");
            return (Criteria) this;
        }

        public Criteria andCouNameIsNotNull() {
            addCriterion("cou_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouNameEqualTo(String value) {
            addCriterion("cou_name =", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotEqualTo(String value) {
            addCriterion("cou_name <>", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThan(String value) {
            addCriterion("cou_name >", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameGreaterThanOrEqualTo(String value) {
            addCriterion("cou_name >=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThan(String value) {
            addCriterion("cou_name <", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLessThanOrEqualTo(String value) {
            addCriterion("cou_name <=", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameLike(String value) {
            addCriterion("cou_name like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotLike(String value) {
            addCriterion("cou_name not like", value, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameIn(List<String> values) {
            addCriterion("cou_name in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotIn(List<String> values) {
            addCriterion("cou_name not in", values, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameBetween(String value1, String value2) {
            addCriterion("cou_name between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouNameNotBetween(String value1, String value2) {
            addCriterion("cou_name not between", value1, value2, "couName");
            return (Criteria) this;
        }

        public Criteria andCouImageIsNull() {
            addCriterion("cou_image is null");
            return (Criteria) this;
        }

        public Criteria andCouImageIsNotNull() {
            addCriterion("cou_image is not null");
            return (Criteria) this;
        }

        public Criteria andCouImageEqualTo(String value) {
            addCriterion("cou_image =", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageNotEqualTo(String value) {
            addCriterion("cou_image <>", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageGreaterThan(String value) {
            addCriterion("cou_image >", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageGreaterThanOrEqualTo(String value) {
            addCriterion("cou_image >=", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageLessThan(String value) {
            addCriterion("cou_image <", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageLessThanOrEqualTo(String value) {
            addCriterion("cou_image <=", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageLike(String value) {
            addCriterion("cou_image like", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageNotLike(String value) {
            addCriterion("cou_image not like", value, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageIn(List<String> values) {
            addCriterion("cou_image in", values, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageNotIn(List<String> values) {
            addCriterion("cou_image not in", values, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageBetween(String value1, String value2) {
            addCriterion("cou_image between", value1, value2, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouImageNotBetween(String value1, String value2) {
            addCriterion("cou_image not between", value1, value2, "couImage");
            return (Criteria) this;
        }

        public Criteria andCouSalesIsNull() {
            addCriterion("cou_sales is null");
            return (Criteria) this;
        }

        public Criteria andCouSalesIsNotNull() {
            addCriterion("cou_sales is not null");
            return (Criteria) this;
        }

        public Criteria andCouSalesEqualTo(Integer value) {
            addCriterion("cou_sales =", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesNotEqualTo(Integer value) {
            addCriterion("cou_sales <>", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesGreaterThan(Integer value) {
            addCriterion("cou_sales >", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_sales >=", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesLessThan(Integer value) {
            addCriterion("cou_sales <", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesLessThanOrEqualTo(Integer value) {
            addCriterion("cou_sales <=", value, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesIn(List<Integer> values) {
            addCriterion("cou_sales in", values, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesNotIn(List<Integer> values) {
            addCriterion("cou_sales not in", values, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesBetween(Integer value1, Integer value2) {
            addCriterion("cou_sales between", value1, value2, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_sales not between", value1, value2, "couSales");
            return (Criteria) this;
        }

        public Criteria andCouGradeIsNull() {
            addCriterion("cou_grade is null");
            return (Criteria) this;
        }

        public Criteria andCouGradeIsNotNull() {
            addCriterion("cou_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCouGradeEqualTo(Float value) {
            addCriterion("cou_grade =", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeNotEqualTo(Float value) {
            addCriterion("cou_grade <>", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeGreaterThan(Float value) {
            addCriterion("cou_grade >", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeGreaterThanOrEqualTo(Float value) {
            addCriterion("cou_grade >=", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeLessThan(Float value) {
            addCriterion("cou_grade <", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeLessThanOrEqualTo(Float value) {
            addCriterion("cou_grade <=", value, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeIn(List<Float> values) {
            addCriterion("cou_grade in", values, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeNotIn(List<Float> values) {
            addCriterion("cou_grade not in", values, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeBetween(Float value1, Float value2) {
            addCriterion("cou_grade between", value1, value2, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouGradeNotBetween(Float value1, Float value2) {
            addCriterion("cou_grade not between", value1, value2, "couGrade");
            return (Criteria) this;
        }

        public Criteria andCouStatusIsNull() {
            addCriterion("cou_status is null");
            return (Criteria) this;
        }

        public Criteria andCouStatusIsNotNull() {
            addCriterion("cou_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouStatusEqualTo(Integer value) {
            addCriterion("cou_status =", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusNotEqualTo(Integer value) {
            addCriterion("cou_status <>", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusGreaterThan(Integer value) {
            addCriterion("cou_status >", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_status >=", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusLessThan(Integer value) {
            addCriterion("cou_status <", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cou_status <=", value, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusIn(List<Integer> values) {
            addCriterion("cou_status in", values, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusNotIn(List<Integer> values) {
            addCriterion("cou_status not in", values, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusBetween(Integer value1, Integer value2) {
            addCriterion("cou_status between", value1, value2, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_status not between", value1, value2, "couStatus");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeIsNull() {
            addCriterion("cou_linetime is null");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeIsNotNull() {
            addCriterion("cou_linetime is not null");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeEqualTo(Date value) {
            addCriterion("cou_linetime =", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeNotEqualTo(Date value) {
            addCriterion("cou_linetime <>", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeGreaterThan(Date value) {
            addCriterion("cou_linetime >", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cou_linetime >=", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeLessThan(Date value) {
            addCriterion("cou_linetime <", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeLessThanOrEqualTo(Date value) {
            addCriterion("cou_linetime <=", value, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeIn(List<Date> values) {
            addCriterion("cou_linetime in", values, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeNotIn(List<Date> values) {
            addCriterion("cou_linetime not in", values, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeBetween(Date value1, Date value2) {
            addCriterion("cou_linetime between", value1, value2, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouLinetimeNotBetween(Date value1, Date value2) {
            addCriterion("cou_linetime not between", value1, value2, "couLinetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeIsNull() {
            addCriterion("cou_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeIsNotNull() {
            addCriterion("cou_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeEqualTo(Date value) {
            addCriterion("cou_updatetime =", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeNotEqualTo(Date value) {
            addCriterion("cou_updatetime <>", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeGreaterThan(Date value) {
            addCriterion("cou_updatetime >", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cou_updatetime >=", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeLessThan(Date value) {
            addCriterion("cou_updatetime <", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cou_updatetime <=", value, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeIn(List<Date> values) {
            addCriterion("cou_updatetime in", values, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeNotIn(List<Date> values) {
            addCriterion("cou_updatetime not in", values, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("cou_updatetime between", value1, value2, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cou_updatetime not between", value1, value2, "couUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitIsNull() {
            addCriterion("cou_platform_visit is null");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitIsNotNull() {
            addCriterion("cou_platform_visit is not null");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitEqualTo(Integer value) {
            addCriterion("cou_platform_visit =", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitNotEqualTo(Integer value) {
            addCriterion("cou_platform_visit <>", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitGreaterThan(Integer value) {
            addCriterion("cou_platform_visit >", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_platform_visit >=", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitLessThan(Integer value) {
            addCriterion("cou_platform_visit <", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitLessThanOrEqualTo(Integer value) {
            addCriterion("cou_platform_visit <=", value, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitIn(List<Integer> values) {
            addCriterion("cou_platform_visit in", values, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitNotIn(List<Integer> values) {
            addCriterion("cou_platform_visit not in", values, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitBetween(Integer value1, Integer value2) {
            addCriterion("cou_platform_visit between", value1, value2, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouPlatformVisitNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_platform_visit not between", value1, value2, "couPlatformVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitIsNull() {
            addCriterion("cou_our_visit is null");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitIsNotNull() {
            addCriterion("cou_our_visit is not null");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitEqualTo(Integer value) {
            addCriterion("cou_our_visit =", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitNotEqualTo(Integer value) {
            addCriterion("cou_our_visit <>", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitGreaterThan(Integer value) {
            addCriterion("cou_our_visit >", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_our_visit >=", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitLessThan(Integer value) {
            addCriterion("cou_our_visit <", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitLessThanOrEqualTo(Integer value) {
            addCriterion("cou_our_visit <=", value, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitIn(List<Integer> values) {
            addCriterion("cou_our_visit in", values, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitNotIn(List<Integer> values) {
            addCriterion("cou_our_visit not in", values, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitBetween(Integer value1, Integer value2) {
            addCriterion("cou_our_visit between", value1, value2, "couOurVisit");
            return (Criteria) this;
        }

        public Criteria andCouOurVisitNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_our_visit not between", value1, value2, "couOurVisit");
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