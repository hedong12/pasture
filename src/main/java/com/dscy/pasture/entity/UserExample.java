package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNull() {
            addCriterion("user_open_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNotNull() {
            addCriterion("user_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdEqualTo(String value) {
            addCriterion("user_open_id =", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotEqualTo(String value) {
            addCriterion("user_open_id <>", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThan(String value) {
            addCriterion("user_open_id >", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_open_id >=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThan(String value) {
            addCriterion("user_open_id <", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("user_open_id <=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLike(String value) {
            addCriterion("user_open_id like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotLike(String value) {
            addCriterion("user_open_id not like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIn(List<String> values) {
            addCriterion("user_open_id in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotIn(List<String> values) {
            addCriterion("user_open_id not in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdBetween(String value1, String value2) {
            addCriterion("user_open_id between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("user_open_id not between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdIsNull() {
            addCriterion("user_game_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGameIdIsNotNull() {
            addCriterion("user_game_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGameIdEqualTo(String value) {
            addCriterion("user_game_id =", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdNotEqualTo(String value) {
            addCriterion("user_game_id <>", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdGreaterThan(String value) {
            addCriterion("user_game_id >", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_game_id >=", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdLessThan(String value) {
            addCriterion("user_game_id <", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdLessThanOrEqualTo(String value) {
            addCriterion("user_game_id <=", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdLike(String value) {
            addCriterion("user_game_id like", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdNotLike(String value) {
            addCriterion("user_game_id not like", value, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdIn(List<String> values) {
            addCriterion("user_game_id in", values, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdNotIn(List<String> values) {
            addCriterion("user_game_id not in", values, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdBetween(String value1, String value2) {
            addCriterion("user_game_id between", value1, value2, "userGameId");
            return (Criteria) this;
        }

        public Criteria andUserGameIdNotBetween(String value1, String value2) {
            addCriterion("user_game_id not between", value1, value2, "userGameId");
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

        public Criteria andUserWxSourceIsNull() {
            addCriterion("user_wx_source is null");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceIsNotNull() {
            addCriterion("user_wx_source is not null");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceEqualTo(Integer value) {
            addCriterion("user_wx_source =", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceNotEqualTo(Integer value) {
            addCriterion("user_wx_source <>", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceGreaterThan(Integer value) {
            addCriterion("user_wx_source >", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wx_source >=", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceLessThan(Integer value) {
            addCriterion("user_wx_source <", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceLessThanOrEqualTo(Integer value) {
            addCriterion("user_wx_source <=", value, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceIn(List<Integer> values) {
            addCriterion("user_wx_source in", values, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceNotIn(List<Integer> values) {
            addCriterion("user_wx_source not in", values, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceBetween(Integer value1, Integer value2) {
            addCriterion("user_wx_source between", value1, value2, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserWxSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wx_source not between", value1, value2, "userWxSource");
            return (Criteria) this;
        }

        public Criteria andUserAvatavIsNull() {
            addCriterion("user_avatav is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatavIsNotNull() {
            addCriterion("user_avatav is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatavEqualTo(String value) {
            addCriterion("user_avatav =", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavNotEqualTo(String value) {
            addCriterion("user_avatav <>", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavGreaterThan(String value) {
            addCriterion("user_avatav >", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatav >=", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavLessThan(String value) {
            addCriterion("user_avatav <", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavLessThanOrEqualTo(String value) {
            addCriterion("user_avatav <=", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavLike(String value) {
            addCriterion("user_avatav like", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavNotLike(String value) {
            addCriterion("user_avatav not like", value, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavIn(List<String> values) {
            addCriterion("user_avatav in", values, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavNotIn(List<String> values) {
            addCriterion("user_avatav not in", values, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavBetween(String value1, String value2) {
            addCriterion("user_avatav between", value1, value2, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserAvatavNotBetween(String value1, String value2) {
            addCriterion("user_avatav not between", value1, value2, "userAvatav");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNull() {
            addCriterion("user_points is null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNotNull() {
            addCriterion("user_points is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointsEqualTo(String value) {
            addCriterion("user_points =", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotEqualTo(String value) {
            addCriterion("user_points <>", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThan(String value) {
            addCriterion("user_points >", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThanOrEqualTo(String value) {
            addCriterion("user_points >=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThan(String value) {
            addCriterion("user_points <", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThanOrEqualTo(String value) {
            addCriterion("user_points <=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLike(String value) {
            addCriterion("user_points like", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotLike(String value) {
            addCriterion("user_points not like", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsIn(List<String> values) {
            addCriterion("user_points in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotIn(List<String> values) {
            addCriterion("user_points not in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsBetween(String value1, String value2) {
            addCriterion("user_points between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotBetween(String value1, String value2) {
            addCriterion("user_points not between", value1, value2, "userPoints");
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

        public Criteria andUserSpreadQrcodeIsNull() {
            addCriterion("user_spread_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeIsNotNull() {
            addCriterion("user_spread_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeEqualTo(String value) {
            addCriterion("user_spread_qrcode =", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeNotEqualTo(String value) {
            addCriterion("user_spread_qrcode <>", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeGreaterThan(String value) {
            addCriterion("user_spread_qrcode >", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_spread_qrcode >=", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeLessThan(String value) {
            addCriterion("user_spread_qrcode <", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeLessThanOrEqualTo(String value) {
            addCriterion("user_spread_qrcode <=", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeLike(String value) {
            addCriterion("user_spread_qrcode like", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeNotLike(String value) {
            addCriterion("user_spread_qrcode not like", value, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeIn(List<String> values) {
            addCriterion("user_spread_qrcode in", values, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeNotIn(List<String> values) {
            addCriterion("user_spread_qrcode not in", values, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeBetween(String value1, String value2) {
            addCriterion("user_spread_qrcode between", value1, value2, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserSpreadQrcodeNotBetween(String value1, String value2) {
            addCriterion("user_spread_qrcode not between", value1, value2, "userSpreadQrcode");
            return (Criteria) this;
        }

        public Criteria andUserAnountIsNull() {
            addCriterion("user_anount is null");
            return (Criteria) this;
        }

        public Criteria andUserAnountIsNotNull() {
            addCriterion("user_anount is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnountEqualTo(Integer value) {
            addCriterion("user_anount =", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountNotEqualTo(Integer value) {
            addCriterion("user_anount <>", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountGreaterThan(Integer value) {
            addCriterion("user_anount >", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_anount >=", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountLessThan(Integer value) {
            addCriterion("user_anount <", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountLessThanOrEqualTo(Integer value) {
            addCriterion("user_anount <=", value, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountIn(List<Integer> values) {
            addCriterion("user_anount in", values, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountNotIn(List<Integer> values) {
            addCriterion("user_anount not in", values, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountBetween(Integer value1, Integer value2) {
            addCriterion("user_anount between", value1, value2, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAnountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_anount not between", value1, value2, "userAnount");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeIsNull() {
            addCriterion("user_add_time is null");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeIsNotNull() {
            addCriterion("user_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeEqualTo(Date value) {
            addCriterion("user_add_time =", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeNotEqualTo(Date value) {
            addCriterion("user_add_time <>", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeGreaterThan(Date value) {
            addCriterion("user_add_time >", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_add_time >=", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeLessThan(Date value) {
            addCriterion("user_add_time <", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_add_time <=", value, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeIn(List<Date> values) {
            addCriterion("user_add_time in", values, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeNotIn(List<Date> values) {
            addCriterion("user_add_time not in", values, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeBetween(Date value1, Date value2) {
            addCriterion("user_add_time between", value1, value2, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_add_time not between", value1, value2, "userAddTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNull() {
            addCriterion("user_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNotNull() {
            addCriterion("user_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeEqualTo(Date value) {
            addCriterion("user_update_time =", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_update_time <>", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThan(Date value) {
            addCriterion("user_update_time >", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_update_time >=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThan(Date value) {
            addCriterion("user_update_time <", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_update_time <=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIn(List<Date> values) {
            addCriterion("user_update_time in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_update_time not in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_update_time between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_update_time not between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserSignDayIsNull() {
            addCriterion("user_sign_day is null");
            return (Criteria) this;
        }

        public Criteria andUserSignDayIsNotNull() {
            addCriterion("user_sign_day is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignDayEqualTo(Integer value) {
            addCriterion("user_sign_day =", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayNotEqualTo(Integer value) {
            addCriterion("user_sign_day <>", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayGreaterThan(Integer value) {
            addCriterion("user_sign_day >", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sign_day >=", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayLessThan(Integer value) {
            addCriterion("user_sign_day <", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayLessThanOrEqualTo(Integer value) {
            addCriterion("user_sign_day <=", value, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayIn(List<Integer> values) {
            addCriterion("user_sign_day in", values, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayNotIn(List<Integer> values) {
            addCriterion("user_sign_day not in", values, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayBetween(Integer value1, Integer value2) {
            addCriterion("user_sign_day between", value1, value2, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserSignDayNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sign_day not between", value1, value2, "userSignDay");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdIsNull() {
            addCriterion("user_pets_id is null");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdIsNotNull() {
            addCriterion("user_pets_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdEqualTo(Integer value) {
            addCriterion("user_pets_id =", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdNotEqualTo(Integer value) {
            addCriterion("user_pets_id <>", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdGreaterThan(Integer value) {
            addCriterion("user_pets_id >", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_pets_id >=", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdLessThan(Integer value) {
            addCriterion("user_pets_id <", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_pets_id <=", value, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdIn(List<Integer> values) {
            addCriterion("user_pets_id in", values, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdNotIn(List<Integer> values) {
            addCriterion("user_pets_id not in", values, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdBetween(Integer value1, Integer value2) {
            addCriterion("user_pets_id between", value1, value2, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_pets_id not between", value1, value2, "userPetsId");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelIsNull() {
            addCriterion("user_pets_level is null");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelIsNotNull() {
            addCriterion("user_pets_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelEqualTo(Integer value) {
            addCriterion("user_pets_level =", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelNotEqualTo(Integer value) {
            addCriterion("user_pets_level <>", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelGreaterThan(Integer value) {
            addCriterion("user_pets_level >", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_pets_level >=", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelLessThan(Integer value) {
            addCriterion("user_pets_level <", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_pets_level <=", value, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelIn(List<Integer> values) {
            addCriterion("user_pets_level in", values, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelNotIn(List<Integer> values) {
            addCriterion("user_pets_level not in", values, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_pets_level between", value1, value2, "userPetsLevel");
            return (Criteria) this;
        }

        public Criteria andUserPetsLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_pets_level not between", value1, value2, "userPetsLevel");
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