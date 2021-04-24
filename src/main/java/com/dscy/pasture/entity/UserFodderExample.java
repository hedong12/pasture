package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class UserFodderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFodderExample() {
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

        public Criteria andUfIdIsNull() {
            addCriterion("uf_id is null");
            return (Criteria) this;
        }

        public Criteria andUfIdIsNotNull() {
            addCriterion("uf_id is not null");
            return (Criteria) this;
        }

        public Criteria andUfIdEqualTo(Integer value) {
            addCriterion("uf_id =", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdNotEqualTo(Integer value) {
            addCriterion("uf_id <>", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdGreaterThan(Integer value) {
            addCriterion("uf_id >", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uf_id >=", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdLessThan(Integer value) {
            addCriterion("uf_id <", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdLessThanOrEqualTo(Integer value) {
            addCriterion("uf_id <=", value, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdIn(List<Integer> values) {
            addCriterion("uf_id in", values, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdNotIn(List<Integer> values) {
            addCriterion("uf_id not in", values, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdBetween(Integer value1, Integer value2) {
            addCriterion("uf_id between", value1, value2, "ufId");
            return (Criteria) this;
        }

        public Criteria andUfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uf_id not between", value1, value2, "ufId");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumIsNull() {
            addCriterion("user_fodder_num is null");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumIsNotNull() {
            addCriterion("user_fodder_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumEqualTo(Long value) {
            addCriterion("user_fodder_num =", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumNotEqualTo(Long value) {
            addCriterion("user_fodder_num <>", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumGreaterThan(Long value) {
            addCriterion("user_fodder_num >", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_fodder_num >=", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumLessThan(Long value) {
            addCriterion("user_fodder_num <", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumLessThanOrEqualTo(Long value) {
            addCriterion("user_fodder_num <=", value, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumIn(List<Long> values) {
            addCriterion("user_fodder_num in", values, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumNotIn(List<Long> values) {
            addCriterion("user_fodder_num not in", values, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumBetween(Long value1, Long value2) {
            addCriterion("user_fodder_num between", value1, value2, "userFodderNum");
            return (Criteria) this;
        }

        public Criteria andUserFodderNumNotBetween(Long value1, Long value2) {
            addCriterion("user_fodder_num not between", value1, value2, "userFodderNum");
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