package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.List;

public class PetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetsExample() {
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

        public Criteria andPetsImgIdIsNull() {
            addCriterion("pets_img_id is null");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdIsNotNull() {
            addCriterion("pets_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdEqualTo(Integer value) {
            addCriterion("pets_img_id =", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdNotEqualTo(Integer value) {
            addCriterion("pets_img_id <>", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdGreaterThan(Integer value) {
            addCriterion("pets_img_id >", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pets_img_id >=", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdLessThan(Integer value) {
            addCriterion("pets_img_id <", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("pets_img_id <=", value, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdIn(List<Integer> values) {
            addCriterion("pets_img_id in", values, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdNotIn(List<Integer> values) {
            addCriterion("pets_img_id not in", values, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdBetween(Integer value1, Integer value2) {
            addCriterion("pets_img_id between", value1, value2, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pets_img_id not between", value1, value2, "petsImgId");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlIsNull() {
            addCriterion("pets_img_url is null");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlIsNotNull() {
            addCriterion("pets_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlEqualTo(String value) {
            addCriterion("pets_img_url =", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlNotEqualTo(String value) {
            addCriterion("pets_img_url <>", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlGreaterThan(String value) {
            addCriterion("pets_img_url >", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pets_img_url >=", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlLessThan(String value) {
            addCriterion("pets_img_url <", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlLessThanOrEqualTo(String value) {
            addCriterion("pets_img_url <=", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlLike(String value) {
            addCriterion("pets_img_url like", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlNotLike(String value) {
            addCriterion("pets_img_url not like", value, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlIn(List<String> values) {
            addCriterion("pets_img_url in", values, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlNotIn(List<String> values) {
            addCriterion("pets_img_url not in", values, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlBetween(String value1, String value2) {
            addCriterion("pets_img_url between", value1, value2, "petsImgUrl");
            return (Criteria) this;
        }

        public Criteria andPetsImgUrlNotBetween(String value1, String value2) {
            addCriterion("pets_img_url not between", value1, value2, "petsImgUrl");
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

        public Criteria andPetsExpIsNull() {
            addCriterion("pets_exp is null");
            return (Criteria) this;
        }

        public Criteria andPetsExpIsNotNull() {
            addCriterion("pets_exp is not null");
            return (Criteria) this;
        }

        public Criteria andPetsExpEqualTo(String value) {
            addCriterion("pets_exp =", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpNotEqualTo(String value) {
            addCriterion("pets_exp <>", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpGreaterThan(String value) {
            addCriterion("pets_exp >", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpGreaterThanOrEqualTo(String value) {
            addCriterion("pets_exp >=", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpLessThan(String value) {
            addCriterion("pets_exp <", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpLessThanOrEqualTo(String value) {
            addCriterion("pets_exp <=", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpLike(String value) {
            addCriterion("pets_exp like", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpNotLike(String value) {
            addCriterion("pets_exp not like", value, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpIn(List<String> values) {
            addCriterion("pets_exp in", values, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpNotIn(List<String> values) {
            addCriterion("pets_exp not in", values, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpBetween(String value1, String value2) {
            addCriterion("pets_exp between", value1, value2, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsExpNotBetween(String value1, String value2) {
            addCriterion("pets_exp not between", value1, value2, "petsExp");
            return (Criteria) this;
        }

        public Criteria andPetsStatusIsNull() {
            addCriterion("pets_status is null");
            return (Criteria) this;
        }

        public Criteria andPetsStatusIsNotNull() {
            addCriterion("pets_status is not null");
            return (Criteria) this;
        }

        public Criteria andPetsStatusEqualTo(Integer value) {
            addCriterion("pets_status =", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusNotEqualTo(Integer value) {
            addCriterion("pets_status <>", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusGreaterThan(Integer value) {
            addCriterion("pets_status >", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pets_status >=", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusLessThan(Integer value) {
            addCriterion("pets_status <", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pets_status <=", value, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusIn(List<Integer> values) {
            addCriterion("pets_status in", values, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusNotIn(List<Integer> values) {
            addCriterion("pets_status not in", values, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusBetween(Integer value1, Integer value2) {
            addCriterion("pets_status between", value1, value2, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pets_status not between", value1, value2, "petsStatus");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdIsNull() {
            addCriterion("pets_exp_prize_id is null");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdIsNotNull() {
            addCriterion("pets_exp_prize_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdEqualTo(Integer value) {
            addCriterion("pets_exp_prize_id =", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdNotEqualTo(Integer value) {
            addCriterion("pets_exp_prize_id <>", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdGreaterThan(Integer value) {
            addCriterion("pets_exp_prize_id >", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pets_exp_prize_id >=", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdLessThan(Integer value) {
            addCriterion("pets_exp_prize_id <", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pets_exp_prize_id <=", value, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdIn(List<Integer> values) {
            addCriterion("pets_exp_prize_id in", values, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdNotIn(List<Integer> values) {
            addCriterion("pets_exp_prize_id not in", values, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdBetween(Integer value1, Integer value2) {
            addCriterion("pets_exp_prize_id between", value1, value2, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pets_exp_prize_id not between", value1, value2, "petsExpPrizeId");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameIsNull() {
            addCriterion("pets_exp_prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameIsNotNull() {
            addCriterion("pets_exp_prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameEqualTo(String value) {
            addCriterion("pets_exp_prize_name =", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameNotEqualTo(String value) {
            addCriterion("pets_exp_prize_name <>", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameGreaterThan(String value) {
            addCriterion("pets_exp_prize_name >", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pets_exp_prize_name >=", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameLessThan(String value) {
            addCriterion("pets_exp_prize_name <", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("pets_exp_prize_name <=", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameLike(String value) {
            addCriterion("pets_exp_prize_name like", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameNotLike(String value) {
            addCriterion("pets_exp_prize_name not like", value, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameIn(List<String> values) {
            addCriterion("pets_exp_prize_name in", values, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameNotIn(List<String> values) {
            addCriterion("pets_exp_prize_name not in", values, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameBetween(String value1, String value2) {
            addCriterion("pets_exp_prize_name between", value1, value2, "petsExpPrizeName");
            return (Criteria) this;
        }

        public Criteria andPetsExpPrizeNameNotBetween(String value1, String value2) {
            addCriterion("pets_exp_prize_name not between", value1, value2, "petsExpPrizeName");
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