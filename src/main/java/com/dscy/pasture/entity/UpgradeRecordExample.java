package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpgradeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpgradeRecordExample() {
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

        public Criteria andArIdIsNull() {
            addCriterion("ar_id is null");
            return (Criteria) this;
        }

        public Criteria andArIdIsNotNull() {
            addCriterion("ar_id is not null");
            return (Criteria) this;
        }

        public Criteria andArIdEqualTo(Integer value) {
            addCriterion("ar_id =", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotEqualTo(Integer value) {
            addCriterion("ar_id <>", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdGreaterThan(Integer value) {
            addCriterion("ar_id >", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ar_id >=", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdLessThan(Integer value) {
            addCriterion("ar_id <", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdLessThanOrEqualTo(Integer value) {
            addCriterion("ar_id <=", value, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdIn(List<Integer> values) {
            addCriterion("ar_id in", values, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotIn(List<Integer> values) {
            addCriterion("ar_id not in", values, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdBetween(Integer value1, Integer value2) {
            addCriterion("ar_id between", value1, value2, "arId");
            return (Criteria) this;
        }

        public Criteria andArIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ar_id not between", value1, value2, "arId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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