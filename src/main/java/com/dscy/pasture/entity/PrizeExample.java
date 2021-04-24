package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlIsNull() {
            addCriterion("prize_img_url is null");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlIsNotNull() {
            addCriterion("prize_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlEqualTo(String value) {
            addCriterion("prize_img_url =", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlNotEqualTo(String value) {
            addCriterion("prize_img_url <>", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlGreaterThan(String value) {
            addCriterion("prize_img_url >", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("prize_img_url >=", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlLessThan(String value) {
            addCriterion("prize_img_url <", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlLessThanOrEqualTo(String value) {
            addCriterion("prize_img_url <=", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlLike(String value) {
            addCriterion("prize_img_url like", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlNotLike(String value) {
            addCriterion("prize_img_url not like", value, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlIn(List<String> values) {
            addCriterion("prize_img_url in", values, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlNotIn(List<String> values) {
            addCriterion("prize_img_url not in", values, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlBetween(String value1, String value2) {
            addCriterion("prize_img_url between", value1, value2, "prizeImgUrl");
            return (Criteria) this;
        }

        public Criteria andPrizeImgUrlNotBetween(String value1, String value2) {
            addCriterion("prize_img_url not between", value1, value2, "prizeImgUrl");
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