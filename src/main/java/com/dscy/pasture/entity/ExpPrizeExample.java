package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpPrizeExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "eId");
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

        public Criteria andExpIdIsNull() {
            addCriterion("exp_id is null");
            return (Criteria) this;
        }

        public Criteria andExpIdIsNotNull() {
            addCriterion("exp_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpIdEqualTo(Integer value) {
            addCriterion("exp_id =", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotEqualTo(Integer value) {
            addCriterion("exp_id <>", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThan(Integer value) {
            addCriterion("exp_id >", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_id >=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThan(Integer value) {
            addCriterion("exp_id <", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdLessThanOrEqualTo(Integer value) {
            addCriterion("exp_id <=", value, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdIn(List<Integer> values) {
            addCriterion("exp_id in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotIn(List<Integer> values) {
            addCriterion("exp_id not in", values, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdBetween(Integer value1, Integer value2) {
            addCriterion("exp_id between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andExpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_id not between", value1, value2, "expId");
            return (Criteria) this;
        }

        public Criteria andExpNameIsNull() {
            addCriterion("exp_name is null");
            return (Criteria) this;
        }

        public Criteria andExpNameIsNotNull() {
            addCriterion("exp_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpNameEqualTo(String value) {
            addCriterion("exp_name =", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotEqualTo(String value) {
            addCriterion("exp_name <>", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThan(String value) {
            addCriterion("exp_name >", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThanOrEqualTo(String value) {
            addCriterion("exp_name >=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThan(String value) {
            addCriterion("exp_name <", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThanOrEqualTo(String value) {
            addCriterion("exp_name <=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLike(String value) {
            addCriterion("exp_name like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotLike(String value) {
            addCriterion("exp_name not like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameIn(List<String> values) {
            addCriterion("exp_name in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotIn(List<String> values) {
            addCriterion("exp_name not in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameBetween(String value1, String value2) {
            addCriterion("exp_name between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotBetween(String value1, String value2) {
            addCriterion("exp_name not between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andExpImgIsNull() {
            addCriterion("exp_img is null");
            return (Criteria) this;
        }

        public Criteria andExpImgIsNotNull() {
            addCriterion("exp_img is not null");
            return (Criteria) this;
        }

        public Criteria andExpImgEqualTo(String value) {
            addCriterion("exp_img =", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgNotEqualTo(String value) {
            addCriterion("exp_img <>", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgGreaterThan(String value) {
            addCriterion("exp_img >", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgGreaterThanOrEqualTo(String value) {
            addCriterion("exp_img >=", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgLessThan(String value) {
            addCriterion("exp_img <", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgLessThanOrEqualTo(String value) {
            addCriterion("exp_img <=", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgLike(String value) {
            addCriterion("exp_img like", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgNotLike(String value) {
            addCriterion("exp_img not like", value, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgIn(List<String> values) {
            addCriterion("exp_img in", values, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgNotIn(List<String> values) {
            addCriterion("exp_img not in", values, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgBetween(String value1, String value2) {
            addCriterion("exp_img between", value1, value2, "expImg");
            return (Criteria) this;
        }

        public Criteria andExpImgNotBetween(String value1, String value2) {
            addCriterion("exp_img not between", value1, value2, "expImg");
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

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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