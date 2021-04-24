package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class ImgCacheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImgCacheExample() {
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

        public Criteria andImgCacheIdIsNull() {
            addCriterion("img_cache_id is null");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdIsNotNull() {
            addCriterion("img_cache_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdEqualTo(Integer value) {
            addCriterion("img_cache_id =", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdNotEqualTo(Integer value) {
            addCriterion("img_cache_id <>", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdGreaterThan(Integer value) {
            addCriterion("img_cache_id >", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_cache_id >=", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdLessThan(Integer value) {
            addCriterion("img_cache_id <", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_cache_id <=", value, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdIn(List<Integer> values) {
            addCriterion("img_cache_id in", values, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdNotIn(List<Integer> values) {
            addCriterion("img_cache_id not in", values, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdBetween(Integer value1, Integer value2) {
            addCriterion("img_cache_id between", value1, value2, "imgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgCacheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_cache_id not between", value1, value2, "imgCacheId");
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

        public Criteria andImgCacheNameIsNull() {
            addCriterion("img_cache_name is null");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameIsNotNull() {
            addCriterion("img_cache_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameEqualTo(String value) {
            addCriterion("img_cache_name =", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameNotEqualTo(String value) {
            addCriterion("img_cache_name <>", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameGreaterThan(String value) {
            addCriterion("img_cache_name >", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_cache_name >=", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameLessThan(String value) {
            addCriterion("img_cache_name <", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameLessThanOrEqualTo(String value) {
            addCriterion("img_cache_name <=", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameLike(String value) {
            addCriterion("img_cache_name like", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameNotLike(String value) {
            addCriterion("img_cache_name not like", value, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameIn(List<String> values) {
            addCriterion("img_cache_name in", values, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameNotIn(List<String> values) {
            addCriterion("img_cache_name not in", values, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameBetween(String value1, String value2) {
            addCriterion("img_cache_name between", value1, value2, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheNameNotBetween(String value1, String value2) {
            addCriterion("img_cache_name not between", value1, value2, "imgCacheName");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlIsNull() {
            addCriterion("img_cache_url is null");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlIsNotNull() {
            addCriterion("img_cache_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlEqualTo(String value) {
            addCriterion("img_cache_url =", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlNotEqualTo(String value) {
            addCriterion("img_cache_url <>", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlGreaterThan(String value) {
            addCriterion("img_cache_url >", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_cache_url >=", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlLessThan(String value) {
            addCriterion("img_cache_url <", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlLessThanOrEqualTo(String value) {
            addCriterion("img_cache_url <=", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlLike(String value) {
            addCriterion("img_cache_url like", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlNotLike(String value) {
            addCriterion("img_cache_url not like", value, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlIn(List<String> values) {
            addCriterion("img_cache_url in", values, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlNotIn(List<String> values) {
            addCriterion("img_cache_url not in", values, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlBetween(String value1, String value2) {
            addCriterion("img_cache_url between", value1, value2, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheUrlNotBetween(String value1, String value2) {
            addCriterion("img_cache_url not between", value1, value2, "imgCacheUrl");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusIsNull() {
            addCriterion("img_cache_status is null");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusIsNotNull() {
            addCriterion("img_cache_status is not null");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusEqualTo(Integer value) {
            addCriterion("img_cache_status =", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusNotEqualTo(Integer value) {
            addCriterion("img_cache_status <>", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusGreaterThan(Integer value) {
            addCriterion("img_cache_status >", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_cache_status >=", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusLessThan(Integer value) {
            addCriterion("img_cache_status <", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusLessThanOrEqualTo(Integer value) {
            addCriterion("img_cache_status <=", value, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusIn(List<Integer> values) {
            addCriterion("img_cache_status in", values, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusNotIn(List<Integer> values) {
            addCriterion("img_cache_status not in", values, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusBetween(Integer value1, Integer value2) {
            addCriterion("img_cache_status between", value1, value2, "imgCacheStatus");
            return (Criteria) this;
        }

        public Criteria andImgCacheStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("img_cache_status not between", value1, value2, "imgCacheStatus");
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