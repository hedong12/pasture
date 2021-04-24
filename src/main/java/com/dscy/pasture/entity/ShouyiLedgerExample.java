package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class ShouyiLedgerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShouyiLedgerExample() {
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

        public Criteria andSlIdIsNull() {
            addCriterion("sl_id is null");
            return (Criteria) this;
        }

        public Criteria andSlIdIsNotNull() {
            addCriterion("sl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlIdEqualTo(Integer value) {
            addCriterion("sl_id =", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotEqualTo(Integer value) {
            addCriterion("sl_id <>", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThan(Integer value) {
            addCriterion("sl_id >", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl_id >=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThan(Integer value) {
            addCriterion("sl_id <", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThanOrEqualTo(Integer value) {
            addCriterion("sl_id <=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdIn(List<Integer> values) {
            addCriterion("sl_id in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotIn(List<Integer> values) {
            addCriterion("sl_id not in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdBetween(Integer value1, Integer value2) {
            addCriterion("sl_id between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sl_id not between", value1, value2, "slId");
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

        public Criteria andSlNumIsNull() {
            addCriterion("sl_num is null");
            return (Criteria) this;
        }

        public Criteria andSlNumIsNotNull() {
            addCriterion("sl_num is not null");
            return (Criteria) this;
        }

        public Criteria andSlNumEqualTo(String value) {
            addCriterion("sl_num =", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumNotEqualTo(String value) {
            addCriterion("sl_num <>", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumGreaterThan(String value) {
            addCriterion("sl_num >", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumGreaterThanOrEqualTo(String value) {
            addCriterion("sl_num >=", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumLessThan(String value) {
            addCriterion("sl_num <", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumLessThanOrEqualTo(String value) {
            addCriterion("sl_num <=", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumLike(String value) {
            addCriterion("sl_num like", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumNotLike(String value) {
            addCriterion("sl_num not like", value, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumIn(List<String> values) {
            addCriterion("sl_num in", values, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumNotIn(List<String> values) {
            addCriterion("sl_num not in", values, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumBetween(String value1, String value2) {
            addCriterion("sl_num between", value1, value2, "slNum");
            return (Criteria) this;
        }

        public Criteria andSlNumNotBetween(String value1, String value2) {
            addCriterion("sl_num not between", value1, value2, "slNum");
            return (Criteria) this;
        }

        public Criteria andSzIdIsNull() {
            addCriterion("sz_id is null");
            return (Criteria) this;
        }

        public Criteria andSzIdIsNotNull() {
            addCriterion("sz_id is not null");
            return (Criteria) this;
        }

        public Criteria andSzIdEqualTo(Integer value) {
            addCriterion("sz_id =", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdNotEqualTo(Integer value) {
            addCriterion("sz_id <>", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdGreaterThan(Integer value) {
            addCriterion("sz_id >", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sz_id >=", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdLessThan(Integer value) {
            addCriterion("sz_id <", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdLessThanOrEqualTo(Integer value) {
            addCriterion("sz_id <=", value, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdIn(List<Integer> values) {
            addCriterion("sz_id in", values, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdNotIn(List<Integer> values) {
            addCriterion("sz_id not in", values, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdBetween(Integer value1, Integer value2) {
            addCriterion("sz_id between", value1, value2, "szId");
            return (Criteria) this;
        }

        public Criteria andSzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sz_id not between", value1, value2, "szId");
            return (Criteria) this;
        }

        public Criteria andSzNameIsNull() {
            addCriterion("sz_name is null");
            return (Criteria) this;
        }

        public Criteria andSzNameIsNotNull() {
            addCriterion("sz_name is not null");
            return (Criteria) this;
        }

        public Criteria andSzNameEqualTo(String value) {
            addCriterion("sz_name =", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotEqualTo(String value) {
            addCriterion("sz_name <>", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameGreaterThan(String value) {
            addCriterion("sz_name >", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameGreaterThanOrEqualTo(String value) {
            addCriterion("sz_name >=", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLessThan(String value) {
            addCriterion("sz_name <", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLessThanOrEqualTo(String value) {
            addCriterion("sz_name <=", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLike(String value) {
            addCriterion("sz_name like", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotLike(String value) {
            addCriterion("sz_name not like", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameIn(List<String> values) {
            addCriterion("sz_name in", values, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotIn(List<String> values) {
            addCriterion("sz_name not in", values, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameBetween(String value1, String value2) {
            addCriterion("sz_name between", value1, value2, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotBetween(String value1, String value2) {
            addCriterion("sz_name not between", value1, value2, "szName");
            return (Criteria) this;
        }

        public Criteria andSzImgIsNull() {
            addCriterion("sz_img is null");
            return (Criteria) this;
        }

        public Criteria andSzImgIsNotNull() {
            addCriterion("sz_img is not null");
            return (Criteria) this;
        }

        public Criteria andSzImgEqualTo(String value) {
            addCriterion("sz_img =", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgNotEqualTo(String value) {
            addCriterion("sz_img <>", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgGreaterThan(String value) {
            addCriterion("sz_img >", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgGreaterThanOrEqualTo(String value) {
            addCriterion("sz_img >=", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgLessThan(String value) {
            addCriterion("sz_img <", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgLessThanOrEqualTo(String value) {
            addCriterion("sz_img <=", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgLike(String value) {
            addCriterion("sz_img like", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgNotLike(String value) {
            addCriterion("sz_img not like", value, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgIn(List<String> values) {
            addCriterion("sz_img in", values, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgNotIn(List<String> values) {
            addCriterion("sz_img not in", values, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgBetween(String value1, String value2) {
            addCriterion("sz_img between", value1, value2, "szImg");
            return (Criteria) this;
        }

        public Criteria andSzImgNotBetween(String value1, String value2) {
            addCriterion("sz_img not between", value1, value2, "szImg");
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