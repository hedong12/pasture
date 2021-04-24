package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoRecordExample() {
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

        public Criteria andVrIdIsNull() {
            addCriterion("vr_id is null");
            return (Criteria) this;
        }

        public Criteria andVrIdIsNotNull() {
            addCriterion("vr_id is not null");
            return (Criteria) this;
        }

        public Criteria andVrIdEqualTo(Integer value) {
            addCriterion("vr_id =", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdNotEqualTo(Integer value) {
            addCriterion("vr_id <>", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdGreaterThan(Integer value) {
            addCriterion("vr_id >", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vr_id >=", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdLessThan(Integer value) {
            addCriterion("vr_id <", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdLessThanOrEqualTo(Integer value) {
            addCriterion("vr_id <=", value, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdIn(List<Integer> values) {
            addCriterion("vr_id in", values, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdNotIn(List<Integer> values) {
            addCriterion("vr_id not in", values, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdBetween(Integer value1, Integer value2) {
            addCriterion("vr_id between", value1, value2, "vrId");
            return (Criteria) this;
        }

        public Criteria andVrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vr_id not between", value1, value2, "vrId");
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

        public Criteria andVideoFodderIdIsNull() {
            addCriterion("video_fodder_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdIsNotNull() {
            addCriterion("video_fodder_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdEqualTo(Integer value) {
            addCriterion("video_fodder_id =", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdNotEqualTo(Integer value) {
            addCriterion("video_fodder_id <>", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdGreaterThan(Integer value) {
            addCriterion("video_fodder_id >", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_fodder_id >=", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdLessThan(Integer value) {
            addCriterion("video_fodder_id <", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_fodder_id <=", value, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdIn(List<Integer> values) {
            addCriterion("video_fodder_id in", values, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdNotIn(List<Integer> values) {
            addCriterion("video_fodder_id not in", values, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdBetween(Integer value1, Integer value2) {
            addCriterion("video_fodder_id between", value1, value2, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_fodder_id not between", value1, value2, "videoFodderId");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIsNull() {
            addCriterion("video_fodder_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIsNotNull() {
            addCriterion("video_fodder_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameEqualTo(String value) {
            addCriterion("video_fodder_name =", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotEqualTo(String value) {
            addCriterion("video_fodder_name <>", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameGreaterThan(String value) {
            addCriterion("video_fodder_name >", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_fodder_name >=", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLessThan(String value) {
            addCriterion("video_fodder_name <", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLessThanOrEqualTo(String value) {
            addCriterion("video_fodder_name <=", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameLike(String value) {
            addCriterion("video_fodder_name like", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotLike(String value) {
            addCriterion("video_fodder_name not like", value, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameIn(List<String> values) {
            addCriterion("video_fodder_name in", values, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotIn(List<String> values) {
            addCriterion("video_fodder_name not in", values, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameBetween(String value1, String value2) {
            addCriterion("video_fodder_name between", value1, value2, "videoFodderName");
            return (Criteria) this;
        }

        public Criteria andVideoFodderNameNotBetween(String value1, String value2) {
            addCriterion("video_fodder_name not between", value1, value2, "videoFodderName");
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