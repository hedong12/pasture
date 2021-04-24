package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class SignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
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

        public Criteria andSignNameIsNull() {
            addCriterion("sign_name is null");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNotNull() {
            addCriterion("sign_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEqualTo(String value) {
            addCriterion("sign_name =", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotEqualTo(String value) {
            addCriterion("sign_name <>", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThan(String value) {
            addCriterion("sign_name >", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThanOrEqualTo(String value) {
            addCriterion("sign_name >=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThan(String value) {
            addCriterion("sign_name <", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThanOrEqualTo(String value) {
            addCriterion("sign_name <=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLike(String value) {
            addCriterion("sign_name like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotLike(String value) {
            addCriterion("sign_name not like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameIn(List<String> values) {
            addCriterion("sign_name in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotIn(List<String> values) {
            addCriterion("sign_name not in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameBetween(String value1, String value2) {
            addCriterion("sign_name between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotBetween(String value1, String value2) {
            addCriterion("sign_name not between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignDayIsNull() {
            addCriterion("sign_day is null");
            return (Criteria) this;
        }

        public Criteria andSignDayIsNotNull() {
            addCriterion("sign_day is not null");
            return (Criteria) this;
        }

        public Criteria andSignDayEqualTo(Integer value) {
            addCriterion("sign_day =", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayNotEqualTo(Integer value) {
            addCriterion("sign_day <>", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayGreaterThan(Integer value) {
            addCriterion("sign_day >", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_day >=", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayLessThan(Integer value) {
            addCriterion("sign_day <", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayLessThanOrEqualTo(Integer value) {
            addCriterion("sign_day <=", value, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayIn(List<Integer> values) {
            addCriterion("sign_day in", values, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayNotIn(List<Integer> values) {
            addCriterion("sign_day not in", values, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayBetween(Integer value1, Integer value2) {
            addCriterion("sign_day between", value1, value2, "signDay");
            return (Criteria) this;
        }

        public Criteria andSignDayNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_day not between", value1, value2, "signDay");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdIsNull() {
            addCriterion("exp_prize_id is null");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdIsNotNull() {
            addCriterion("exp_prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdEqualTo(Integer value) {
            addCriterion("exp_prize_id =", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdNotEqualTo(Integer value) {
            addCriterion("exp_prize_id <>", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdGreaterThan(Integer value) {
            addCriterion("exp_prize_id >", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_prize_id >=", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdLessThan(Integer value) {
            addCriterion("exp_prize_id <", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("exp_prize_id <=", value, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdIn(List<Integer> values) {
            addCriterion("exp_prize_id in", values, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdNotIn(List<Integer> values) {
            addCriterion("exp_prize_id not in", values, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("exp_prize_id between", value1, value2, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_prize_id not between", value1, value2, "expPrizeId");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameIsNull() {
            addCriterion("exp_prize_name is null");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameIsNotNull() {
            addCriterion("exp_prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameEqualTo(String value) {
            addCriterion("exp_prize_name =", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameNotEqualTo(String value) {
            addCriterion("exp_prize_name <>", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameGreaterThan(String value) {
            addCriterion("exp_prize_name >", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exp_prize_name >=", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameLessThan(String value) {
            addCriterion("exp_prize_name <", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("exp_prize_name <=", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameLike(String value) {
            addCriterion("exp_prize_name like", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameNotLike(String value) {
            addCriterion("exp_prize_name not like", value, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameIn(List<String> values) {
            addCriterion("exp_prize_name in", values, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameNotIn(List<String> values) {
            addCriterion("exp_prize_name not in", values, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameBetween(String value1, String value2) {
            addCriterion("exp_prize_name between", value1, value2, "expPrizeName");
            return (Criteria) this;
        }

        public Criteria andExpPrizeNameNotBetween(String value1, String value2) {
            addCriterion("exp_prize_name not between", value1, value2, "expPrizeName");
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