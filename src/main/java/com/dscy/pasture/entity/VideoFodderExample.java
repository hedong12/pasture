package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class VideoFodderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoFodderExample() {
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

        public Criteria andVfIdIsNull() {
            addCriterion("vf_id is null");
            return (Criteria) this;
        }

        public Criteria andVfIdIsNotNull() {
            addCriterion("vf_id is not null");
            return (Criteria) this;
        }

        public Criteria andVfIdEqualTo(Integer value) {
            addCriterion("vf_id =", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdNotEqualTo(Integer value) {
            addCriterion("vf_id <>", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdGreaterThan(Integer value) {
            addCriterion("vf_id >", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vf_id >=", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdLessThan(Integer value) {
            addCriterion("vf_id <", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdLessThanOrEqualTo(Integer value) {
            addCriterion("vf_id <=", value, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdIn(List<Integer> values) {
            addCriterion("vf_id in", values, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdNotIn(List<Integer> values) {
            addCriterion("vf_id not in", values, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdBetween(Integer value1, Integer value2) {
            addCriterion("vf_id between", value1, value2, "vfId");
            return (Criteria) this;
        }

        public Criteria andVfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vf_id not between", value1, value2, "vfId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIsNull() {
            addCriterion("video_fodder_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIsNotNull() {
            addCriterion("video_fodder_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameEqualTo(String value) {
            addCriterion("video_fodder_name =", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotEqualTo(String value) {
            addCriterion("video_fodder_name <>", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameGreaterThan(String value) {
            addCriterion("video_fodder_name >", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_fodder_name >=", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLessThan(String value) {
            addCriterion("video_fodder_name <", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLessThanOrEqualTo(String value) {
            addCriterion("video_fodder_name <=", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLike(String value) {
            addCriterion("video_fodder_name like", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotLike(String value) {
            addCriterion("video_fodder_name not like", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIn(List<String> values) {
            addCriterion("video_fodder_name in", values, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotIn(List<String> values) {
            addCriterion("video_fodder_name not in", values, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameBetween(String value1, String value2) {
            addCriterion("video_fodder_name between", value1, value2, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotBetween(String value1, String value2) {
            addCriterion("video_fodder_name not between", value1, value2, "videoFodderName");
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

        public Criteria andFodderImgIsNull() {
            addCriterion("fodder_img is null");
            return (Criteria) this;
        }

        public Criteria andFodderImgIsNotNull() {
            addCriterion("fodder_img is not null");
            return (Criteria) this;
        }

        public Criteria andFodderImgEqualTo(String value) {
            addCriterion("fodder_img =", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgNotEqualTo(String value) {
            addCriterion("fodder_img <>", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgGreaterThan(String value) {
            addCriterion("fodder_img >", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgGreaterThanOrEqualTo(String value) {
            addCriterion("fodder_img >=", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgLessThan(String value) {
            addCriterion("fodder_img <", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgLessThanOrEqualTo(String value) {
            addCriterion("fodder_img <=", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgLike(String value) {
            addCriterion("fodder_img like", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgNotLike(String value) {
            addCriterion("fodder_img not like", value, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgIn(List<String> values) {
            addCriterion("fodder_img in", values, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgNotIn(List<String> values) {
            addCriterion("fodder_img not in", values, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgBetween(String value1, String value2) {
            addCriterion("fodder_img between", value1, value2, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andFodderImgNotBetween(String value1, String value2) {
            addCriterion("fodder_img not between", value1, value2, "fodderImg");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPetsIdIsNull() {
            addCriterion("pets_id is null");
            return (Criteria) this;
        }

        public Criteria andPetsIdIsNotNull() {
            addCriterion("pets_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetsIdEqualTo(Integer value) {
            addCriterion("pets_id =", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdNotEqualTo(Integer value) {
            addCriterion("pets_id <>", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdGreaterThan(Integer value) {
            addCriterion("pets_id >", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pets_id >=", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdLessThan(Integer value) {
            addCriterion("pets_id <", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdLessThanOrEqualTo(Integer value) {
            addCriterion("pets_id <=", value, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdIn(List<Integer> values) {
            addCriterion("pets_id in", values, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdNotIn(List<Integer> values) {
            addCriterion("pets_id not in", values, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdBetween(Integer value1, Integer value2) {
            addCriterion("pets_id between", value1, value2, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pets_id not between", value1, value2, "petsId");
            return (Criteria) this;
        }

        public Criteria andPetsNameIsNull() {
            addCriterion("pets_name is null");
            return (Criteria) this;
        }

        public Criteria andPetsNameIsNotNull() {
            addCriterion("pets_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetsNameEqualTo(String value) {
            addCriterion("pets_name =", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameNotEqualTo(String value) {
            addCriterion("pets_name <>", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameGreaterThan(String value) {
            addCriterion("pets_name >", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameGreaterThanOrEqualTo(String value) {
            addCriterion("pets_name >=", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameLessThan(String value) {
            addCriterion("pets_name <", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameLessThanOrEqualTo(String value) {
            addCriterion("pets_name <=", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameLike(String value) {
            addCriterion("pets_name like", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameNotLike(String value) {
            addCriterion("pets_name not like", value, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameIn(List<String> values) {
            addCriterion("pets_name in", values, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameNotIn(List<String> values) {
            addCriterion("pets_name not in", values, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameBetween(String value1, String value2) {
            addCriterion("pets_name between", value1, value2, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsNameNotBetween(String value1, String value2) {
            addCriterion("pets_name not between", value1, value2, "petsName");
            return (Criteria) this;
        }

        public Criteria andPetsLevelIsNull() {
            addCriterion("pets_level is null");
            return (Criteria) this;
        }

        public Criteria andPetsLevelIsNotNull() {
            addCriterion("pets_level is not null");
            return (Criteria) this;
        }

        public Criteria andPetsLevelEqualTo(Integer value) {
            addCriterion("pets_level =", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelNotEqualTo(Integer value) {
            addCriterion("pets_level <>", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelGreaterThan(Integer value) {
            addCriterion("pets_level >", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pets_level >=", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelLessThan(Integer value) {
            addCriterion("pets_level <", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelLessThanOrEqualTo(Integer value) {
            addCriterion("pets_level <=", value, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelIn(List<Integer> values) {
            addCriterion("pets_level in", values, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelNotIn(List<Integer> values) {
            addCriterion("pets_level not in", values, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelBetween(Integer value1, Integer value2) {
            addCriterion("pets_level between", value1, value2, "petsLevel");
            return (Criteria) this;
        }

        public Criteria andPetsLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pets_level not between", value1, value2, "petsLevel");
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