package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class SceneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneExample() {
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

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNull() {
            addCriterion("scene_name is null");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNotNull() {
            addCriterion("scene_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceneNameEqualTo(String value) {
            addCriterion("scene_name =", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotEqualTo(String value) {
            addCriterion("scene_name <>", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThan(String value) {
            addCriterion("scene_name >", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThanOrEqualTo(String value) {
            addCriterion("scene_name >=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThan(String value) {
            addCriterion("scene_name <", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThanOrEqualTo(String value) {
            addCriterion("scene_name <=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLike(String value) {
            addCriterion("scene_name like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotLike(String value) {
            addCriterion("scene_name not like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameIn(List<String> values) {
            addCriterion("scene_name in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotIn(List<String> values) {
            addCriterion("scene_name not in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameBetween(String value1, String value2) {
            addCriterion("scene_name between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotBetween(String value1, String value2) {
            addCriterion("scene_name not between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlIsNull() {
            addCriterion("scene_img_url is null");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlIsNotNull() {
            addCriterion("scene_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlEqualTo(String value) {
            addCriterion("scene_img_url =", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlNotEqualTo(String value) {
            addCriterion("scene_img_url <>", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlGreaterThan(String value) {
            addCriterion("scene_img_url >", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("scene_img_url >=", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlLessThan(String value) {
            addCriterion("scene_img_url <", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlLessThanOrEqualTo(String value) {
            addCriterion("scene_img_url <=", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlLike(String value) {
            addCriterion("scene_img_url like", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlNotLike(String value) {
            addCriterion("scene_img_url not like", value, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlIn(List<String> values) {
            addCriterion("scene_img_url in", values, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlNotIn(List<String> values) {
            addCriterion("scene_img_url not in", values, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlBetween(String value1, String value2) {
            addCriterion("scene_img_url between", value1, value2, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneImgUrlNotBetween(String value1, String value2) {
            addCriterion("scene_img_url not between", value1, value2, "sceneImgUrl");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNull() {
            addCriterion("scene_status is null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNotNull() {
            addCriterion("scene_status is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusEqualTo(Integer value) {
            addCriterion("scene_status =", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotEqualTo(Integer value) {
            addCriterion("scene_status <>", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThan(Integer value) {
            addCriterion("scene_status >", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_status >=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThan(Integer value) {
            addCriterion("scene_status <", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("scene_status <=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIn(List<Integer> values) {
            addCriterion("scene_status in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotIn(List<Integer> values) {
            addCriterion("scene_status not in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusBetween(Integer value1, Integer value2) {
            addCriterion("scene_status between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_status not between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameIsNull() {
            addCriterion("scene_logo_name is null");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameIsNotNull() {
            addCriterion("scene_logo_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameEqualTo(String value) {
            addCriterion("scene_logo_name =", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameNotEqualTo(String value) {
            addCriterion("scene_logo_name <>", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameGreaterThan(String value) {
            addCriterion("scene_logo_name >", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameGreaterThanOrEqualTo(String value) {
            addCriterion("scene_logo_name >=", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameLessThan(String value) {
            addCriterion("scene_logo_name <", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameLessThanOrEqualTo(String value) {
            addCriterion("scene_logo_name <=", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameLike(String value) {
            addCriterion("scene_logo_name like", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameNotLike(String value) {
            addCriterion("scene_logo_name not like", value, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameIn(List<String> values) {
            addCriterion("scene_logo_name in", values, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameNotIn(List<String> values) {
            addCriterion("scene_logo_name not in", values, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameBetween(String value1, String value2) {
            addCriterion("scene_logo_name between", value1, value2, "sceneLogoName");
            return (Criteria) this;
        }

        public Criteria andSceneLogoNameNotBetween(String value1, String value2) {
            addCriterion("scene_logo_name not between", value1, value2, "sceneLogoName");
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