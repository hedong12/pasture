package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class ImgGifExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImgGifExample() {
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

        public Criteria andImgGifIdIsNull() {
            addCriterion("img_gif_id is null");
            return (Criteria) this;
        }

        public Criteria andImgGifIdIsNotNull() {
            addCriterion("img_gif_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgGifIdEqualTo(Integer value) {
            addCriterion("img_gif_id =", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdNotEqualTo(Integer value) {
            addCriterion("img_gif_id <>", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdGreaterThan(Integer value) {
            addCriterion("img_gif_id >", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_gif_id >=", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdLessThan(Integer value) {
            addCriterion("img_gif_id <", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_gif_id <=", value, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdIn(List<Integer> values) {
            addCriterion("img_gif_id in", values, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdNotIn(List<Integer> values) {
            addCriterion("img_gif_id not in", values, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdBetween(Integer value1, Integer value2) {
            addCriterion("img_gif_id between", value1, value2, "imgGifId");
            return (Criteria) this;
        }

        public Criteria andImgGifIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_gif_id not between", value1, value2, "imgGifId");
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

        public Criteria andImgGifImgCacheIdIsNull() {
            addCriterion("img_gif_img_cache_id is null");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdIsNotNull() {
            addCriterion("img_gif_img_cache_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdEqualTo(Integer value) {
            addCriterion("img_gif_img_cache_id =", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdNotEqualTo(Integer value) {
            addCriterion("img_gif_img_cache_id <>", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdGreaterThan(Integer value) {
            addCriterion("img_gif_img_cache_id >", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_gif_img_cache_id >=", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdLessThan(Integer value) {
            addCriterion("img_gif_img_cache_id <", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_gif_img_cache_id <=", value, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdIn(List<Integer> values) {
            addCriterion("img_gif_img_cache_id in", values, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdNotIn(List<Integer> values) {
            addCriterion("img_gif_img_cache_id not in", values, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdBetween(Integer value1, Integer value2) {
            addCriterion("img_gif_img_cache_id between", value1, value2, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifImgCacheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_gif_img_cache_id not between", value1, value2, "imgGifImgCacheId");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlIsNull() {
            addCriterion("img_gif_url is null");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlIsNotNull() {
            addCriterion("img_gif_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlEqualTo(String value) {
            addCriterion("img_gif_url =", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlNotEqualTo(String value) {
            addCriterion("img_gif_url <>", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlGreaterThan(String value) {
            addCriterion("img_gif_url >", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_gif_url >=", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlLessThan(String value) {
            addCriterion("img_gif_url <", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlLessThanOrEqualTo(String value) {
            addCriterion("img_gif_url <=", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlLike(String value) {
            addCriterion("img_gif_url like", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlNotLike(String value) {
            addCriterion("img_gif_url not like", value, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlIn(List<String> values) {
            addCriterion("img_gif_url in", values, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlNotIn(List<String> values) {
            addCriterion("img_gif_url not in", values, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlBetween(String value1, String value2) {
            addCriterion("img_gif_url between", value1, value2, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andImgGifUrlNotBetween(String value1, String value2) {
            addCriterion("img_gif_url not between", value1, value2, "imgGifUrl");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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