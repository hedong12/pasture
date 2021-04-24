package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class CashRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashRuleExample() {
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

        public Criteria andCrIdIsNull() {
            addCriterion("cr_id is null");
            return (Criteria) this;
        }

        public Criteria andCrIdIsNotNull() {
            addCriterion("cr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrIdEqualTo(Integer value) {
            addCriterion("cr_id =", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotEqualTo(Integer value) {
            addCriterion("cr_id <>", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThan(Integer value) {
            addCriterion("cr_id >", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_id >=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThan(Integer value) {
            addCriterion("cr_id <", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdLessThanOrEqualTo(Integer value) {
            addCriterion("cr_id <=", value, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdIn(List<Integer> values) {
            addCriterion("cr_id in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotIn(List<Integer> values) {
            addCriterion("cr_id not in", values, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdBetween(Integer value1, Integer value2) {
            addCriterion("cr_id between", value1, value2, "crId");
            return (Criteria) this;
        }

        public Criteria andCrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_id not between", value1, value2, "crId");
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

        public Criteria andCrNameIsNull() {
            addCriterion("cr_name is null");
            return (Criteria) this;
        }

        public Criteria andCrNameIsNotNull() {
            addCriterion("cr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrNameEqualTo(String value) {
            addCriterion("cr_name =", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameNotEqualTo(String value) {
            addCriterion("cr_name <>", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameGreaterThan(String value) {
            addCriterion("cr_name >", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameGreaterThanOrEqualTo(String value) {
            addCriterion("cr_name >=", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameLessThan(String value) {
            addCriterion("cr_name <", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameLessThanOrEqualTo(String value) {
            addCriterion("cr_name <=", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameLike(String value) {
            addCriterion("cr_name like", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameNotLike(String value) {
            addCriterion("cr_name not like", value, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameIn(List<String> values) {
            addCriterion("cr_name in", values, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameNotIn(List<String> values) {
            addCriterion("cr_name not in", values, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameBetween(String value1, String value2) {
            addCriterion("cr_name between", value1, value2, "crName");
            return (Criteria) this;
        }

        public Criteria andCrNameNotBetween(String value1, String value2) {
            addCriterion("cr_name not between", value1, value2, "crName");
            return (Criteria) this;
        }

        public Criteria andCrImgIsNull() {
            addCriterion("cr_img is null");
            return (Criteria) this;
        }

        public Criteria andCrImgIsNotNull() {
            addCriterion("cr_img is not null");
            return (Criteria) this;
        }

        public Criteria andCrImgEqualTo(String value) {
            addCriterion("cr_img =", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgNotEqualTo(String value) {
            addCriterion("cr_img <>", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgGreaterThan(String value) {
            addCriterion("cr_img >", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgGreaterThanOrEqualTo(String value) {
            addCriterion("cr_img >=", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgLessThan(String value) {
            addCriterion("cr_img <", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgLessThanOrEqualTo(String value) {
            addCriterion("cr_img <=", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgLike(String value) {
            addCriterion("cr_img like", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgNotLike(String value) {
            addCriterion("cr_img not like", value, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgIn(List<String> values) {
            addCriterion("cr_img in", values, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgNotIn(List<String> values) {
            addCriterion("cr_img not in", values, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgBetween(String value1, String value2) {
            addCriterion("cr_img between", value1, value2, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrImgNotBetween(String value1, String value2) {
            addCriterion("cr_img not between", value1, value2, "crImg");
            return (Criteria) this;
        }

        public Criteria andCrNumIsNull() {
            addCriterion("cr_num is null");
            return (Criteria) this;
        }

        public Criteria andCrNumIsNotNull() {
            addCriterion("cr_num is not null");
            return (Criteria) this;
        }

        public Criteria andCrNumEqualTo(Long value) {
            addCriterion("cr_num =", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumNotEqualTo(Long value) {
            addCriterion("cr_num <>", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumGreaterThan(Long value) {
            addCriterion("cr_num >", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumGreaterThanOrEqualTo(Long value) {
            addCriterion("cr_num >=", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumLessThan(Long value) {
            addCriterion("cr_num <", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumLessThanOrEqualTo(Long value) {
            addCriterion("cr_num <=", value, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumIn(List<Long> values) {
            addCriterion("cr_num in", values, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumNotIn(List<Long> values) {
            addCriterion("cr_num not in", values, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumBetween(Long value1, Long value2) {
            addCriterion("cr_num between", value1, value2, "crNum");
            return (Criteria) this;
        }

        public Criteria andCrNumNotBetween(Long value1, Long value2) {
            addCriterion("cr_num not between", value1, value2, "crNum");
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

        public Criteria andTiaojianNumIsNull() {
            addCriterion("tiaojian_num is null");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumIsNotNull() {
            addCriterion("tiaojian_num is not null");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumEqualTo(Long value) {
            addCriterion("tiaojian_num =", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumNotEqualTo(Long value) {
            addCriterion("tiaojian_num <>", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumGreaterThan(Long value) {
            addCriterion("tiaojian_num >", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumGreaterThanOrEqualTo(Long value) {
            addCriterion("tiaojian_num >=", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumLessThan(Long value) {
            addCriterion("tiaojian_num <", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumLessThanOrEqualTo(Long value) {
            addCriterion("tiaojian_num <=", value, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumIn(List<Long> values) {
            addCriterion("tiaojian_num in", values, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumNotIn(List<Long> values) {
            addCriterion("tiaojian_num not in", values, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumBetween(Long value1, Long value2) {
            addCriterion("tiaojian_num between", value1, value2, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andTiaojianNumNotBetween(Long value1, Long value2) {
            addCriterion("tiaojian_num not between", value1, value2, "tiaojianNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
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