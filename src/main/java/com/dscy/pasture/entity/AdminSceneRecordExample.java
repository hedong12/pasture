package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminSceneRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminSceneRecordExample() {
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

        public Criteria andAsrIdIsNull() {
            addCriterion("asr_id is null");
            return (Criteria) this;
        }

        public Criteria andAsrIdIsNotNull() {
            addCriterion("asr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAsrIdEqualTo(Integer value) {
            addCriterion("asr_id =", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdNotEqualTo(Integer value) {
            addCriterion("asr_id <>", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdGreaterThan(Integer value) {
            addCriterion("asr_id >", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asr_id >=", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdLessThan(Integer value) {
            addCriterion("asr_id <", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("asr_id <=", value, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdIn(List<Integer> values) {
            addCriterion("asr_id in", values, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdNotIn(List<Integer> values) {
            addCriterion("asr_id not in", values, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdBetween(Integer value1, Integer value2) {
            addCriterion("asr_id between", value1, value2, "asrId");
            return (Criteria) this;
        }

        public Criteria andAsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("asr_id not between", value1, value2, "asrId");
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

        public Criteria andSceneImgIsNull() {
            addCriterion("scene_img is null");
            return (Criteria) this;
        }

        public Criteria andSceneImgIsNotNull() {
            addCriterion("scene_img is not null");
            return (Criteria) this;
        }

        public Criteria andSceneImgEqualTo(String value) {
            addCriterion("scene_img =", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgNotEqualTo(String value) {
            addCriterion("scene_img <>", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgGreaterThan(String value) {
            addCriterion("scene_img >", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgGreaterThanOrEqualTo(String value) {
            addCriterion("scene_img >=", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgLessThan(String value) {
            addCriterion("scene_img <", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgLessThanOrEqualTo(String value) {
            addCriterion("scene_img <=", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgLike(String value) {
            addCriterion("scene_img like", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgNotLike(String value) {
            addCriterion("scene_img not like", value, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgIn(List<String> values) {
            addCriterion("scene_img in", values, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgNotIn(List<String> values) {
            addCriterion("scene_img not in", values, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgBetween(String value1, String value2) {
            addCriterion("scene_img between", value1, value2, "sceneImg");
            return (Criteria) this;
        }

        public Criteria andSceneImgNotBetween(String value1, String value2) {
            addCriterion("scene_img not between", value1, value2, "sceneImg");
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andPastureNameIsNull() {
            addCriterion("pasture_name is null");
            return (Criteria) this;
        }

        public Criteria andPastureNameIsNotNull() {
            addCriterion("pasture_name is not null");
            return (Criteria) this;
        }

        public Criteria andPastureNameEqualTo(String value) {
            addCriterion("pasture_name =", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameNotEqualTo(String value) {
            addCriterion("pasture_name <>", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameGreaterThan(String value) {
            addCriterion("pasture_name >", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameGreaterThanOrEqualTo(String value) {
            addCriterion("pasture_name >=", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameLessThan(String value) {
            addCriterion("pasture_name <", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameLessThanOrEqualTo(String value) {
            addCriterion("pasture_name <=", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameLike(String value) {
            addCriterion("pasture_name like", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameNotLike(String value) {
            addCriterion("pasture_name not like", value, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameIn(List<String> values) {
            addCriterion("pasture_name in", values, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameNotIn(List<String> values) {
            addCriterion("pasture_name not in", values, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameBetween(String value1, String value2) {
            addCriterion("pasture_name between", value1, value2, "pastureName");
            return (Criteria) this;
        }

        public Criteria andPastureNameNotBetween(String value1, String value2) {
            addCriterion("pasture_name not between", value1, value2, "pastureName");
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