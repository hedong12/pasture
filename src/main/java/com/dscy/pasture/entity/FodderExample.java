package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class FodderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FodderExample() {
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

        public Criteria andFodderIdIsNull() {
            addCriterion("fodder_id is null");
            return (Criteria) this;
        }

        public Criteria andFodderIdIsNotNull() {
            addCriterion("fodder_id is not null");
            return (Criteria) this;
        }

        public Criteria andFodderIdEqualTo(Integer value) {
            addCriterion("fodder_id =", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdNotEqualTo(Integer value) {
            addCriterion("fodder_id <>", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdGreaterThan(Integer value) {
            addCriterion("fodder_id >", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fodder_id >=", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdLessThan(Integer value) {
            addCriterion("fodder_id <", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdLessThanOrEqualTo(Integer value) {
            addCriterion("fodder_id <=", value, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdIn(List<Integer> values) {
            addCriterion("fodder_id in", values, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdNotIn(List<Integer> values) {
            addCriterion("fodder_id not in", values, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdBetween(Integer value1, Integer value2) {
            addCriterion("fodder_id between", value1, value2, "fodderId");
            return (Criteria) this;
        }

        public Criteria andFodderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fodder_id not between", value1, value2, "fodderId");
            return (Criteria) this;
        }

        public Criteria andShowIdIsNull() {
            addCriterion("show_id is null");
            return (Criteria) this;
        }

        public Criteria andShowIdIsNotNull() {
            addCriterion("show_id is not null");
            return (Criteria) this;
        }

        public Criteria andShowIdEqualTo(Integer value) {
            addCriterion("show_id =", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotEqualTo(Integer value) {
            addCriterion("show_id <>", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThan(Integer value) {
            addCriterion("show_id >", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_id >=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThan(Integer value) {
            addCriterion("show_id <", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThanOrEqualTo(Integer value) {
            addCriterion("show_id <=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdIn(List<Integer> values) {
            addCriterion("show_id in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotIn(List<Integer> values) {
            addCriterion("show_id not in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdBetween(Integer value1, Integer value2) {
            addCriterion("show_id between", value1, value2, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("show_id not between", value1, value2, "showId");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlIsNull() {
            addCriterion("fodder_img_url is null");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlIsNotNull() {
            addCriterion("fodder_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlEqualTo(String value) {
            addCriterion("fodder_img_url =", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlNotEqualTo(String value) {
            addCriterion("fodder_img_url <>", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlGreaterThan(String value) {
            addCriterion("fodder_img_url >", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fodder_img_url >=", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlLessThan(String value) {
            addCriterion("fodder_img_url <", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlLessThanOrEqualTo(String value) {
            addCriterion("fodder_img_url <=", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlLike(String value) {
            addCriterion("fodder_img_url like", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlNotLike(String value) {
            addCriterion("fodder_img_url not like", value, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlIn(List<String> values) {
            addCriterion("fodder_img_url in", values, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlNotIn(List<String> values) {
            addCriterion("fodder_img_url not in", values, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlBetween(String value1, String value2) {
            addCriterion("fodder_img_url between", value1, value2, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderImgUrlNotBetween(String value1, String value2) {
            addCriterion("fodder_img_url not between", value1, value2, "fodderImgUrl");
            return (Criteria) this;
        }

        public Criteria andFodderLevelIsNull() {
            addCriterion("fodder_level is null");
            return (Criteria) this;
        }

        public Criteria andFodderLevelIsNotNull() {
            addCriterion("fodder_level is not null");
            return (Criteria) this;
        }

        public Criteria andFodderLevelEqualTo(Integer value) {
            addCriterion("fodder_level =", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelNotEqualTo(Integer value) {
            addCriterion("fodder_level <>", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelGreaterThan(Integer value) {
            addCriterion("fodder_level >", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("fodder_level >=", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelLessThan(Integer value) {
            addCriterion("fodder_level <", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelLessThanOrEqualTo(Integer value) {
            addCriterion("fodder_level <=", value, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelIn(List<Integer> values) {
            addCriterion("fodder_level in", values, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelNotIn(List<Integer> values) {
            addCriterion("fodder_level not in", values, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelBetween(Integer value1, Integer value2) {
            addCriterion("fodder_level between", value1, value2, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("fodder_level not between", value1, value2, "fodderLevel");
            return (Criteria) this;
        }

        public Criteria andFodderExpIsNull() {
            addCriterion("fodder_exp is null");
            return (Criteria) this;
        }

        public Criteria andFodderExpIsNotNull() {
            addCriterion("fodder_exp is not null");
            return (Criteria) this;
        }

        public Criteria andFodderExpEqualTo(String value) {
            addCriterion("fodder_exp =", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpNotEqualTo(String value) {
            addCriterion("fodder_exp <>", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpGreaterThan(String value) {
            addCriterion("fodder_exp >", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpGreaterThanOrEqualTo(String value) {
            addCriterion("fodder_exp >=", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpLessThan(String value) {
            addCriterion("fodder_exp <", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpLessThanOrEqualTo(String value) {
            addCriterion("fodder_exp <=", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpLike(String value) {
            addCriterion("fodder_exp like", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpNotLike(String value) {
            addCriterion("fodder_exp not like", value, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpIn(List<String> values) {
            addCriterion("fodder_exp in", values, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpNotIn(List<String> values) {
            addCriterion("fodder_exp not in", values, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpBetween(String value1, String value2) {
            addCriterion("fodder_exp between", value1, value2, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderExpNotBetween(String value1, String value2) {
            addCriterion("fodder_exp not between", value1, value2, "fodderExp");
            return (Criteria) this;
        }

        public Criteria andFodderStatusIsNull() {
            addCriterion("fodder_status is null");
            return (Criteria) this;
        }

        public Criteria andFodderStatusIsNotNull() {
            addCriterion("fodder_status is not null");
            return (Criteria) this;
        }

        public Criteria andFodderStatusEqualTo(Integer value) {
            addCriterion("fodder_status =", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusNotEqualTo(Integer value) {
            addCriterion("fodder_status <>", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusGreaterThan(Integer value) {
            addCriterion("fodder_status >", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fodder_status >=", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusLessThan(Integer value) {
            addCriterion("fodder_status <", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fodder_status <=", value, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusIn(List<Integer> values) {
            addCriterion("fodder_status in", values, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusNotIn(List<Integer> values) {
            addCriterion("fodder_status not in", values, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusBetween(Integer value1, Integer value2) {
            addCriterion("fodder_status between", value1, value2, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fodder_status not between", value1, value2, "fodderStatus");
            return (Criteria) this;
        }

        public Criteria andFodderNameIsNull() {
            addCriterion("fodder_name is null");
            return (Criteria) this;
        }

        public Criteria andFodderNameIsNotNull() {
            addCriterion("fodder_name is not null");
            return (Criteria) this;
        }

        public Criteria andFodderNameEqualTo(String value) {
            addCriterion("fodder_name =", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameNotEqualTo(String value) {
            addCriterion("fodder_name <>", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameGreaterThan(String value) {
            addCriterion("fodder_name >", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameGreaterThanOrEqualTo(String value) {
            addCriterion("fodder_name >=", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameLessThan(String value) {
            addCriterion("fodder_name <", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameLessThanOrEqualTo(String value) {
            addCriterion("fodder_name <=", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameLike(String value) {
            addCriterion("fodder_name like", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameNotLike(String value) {
            addCriterion("fodder_name not like", value, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameIn(List<String> values) {
            addCriterion("fodder_name in", values, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameNotIn(List<String> values) {
            addCriterion("fodder_name not in", values, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameBetween(String value1, String value2) {
            addCriterion("fodder_name between", value1, value2, "fodderName");
            return (Criteria) this;
        }

        public Criteria andFodderNameNotBetween(String value1, String value2) {
            addCriterion("fodder_name not between", value1, value2, "fodderName");
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