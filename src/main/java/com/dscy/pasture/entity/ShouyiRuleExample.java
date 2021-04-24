package com.dscy.pasture.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShouyiRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShouyiRuleExample() {
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

        public Criteria andSrIdIsNull() {
            addCriterion("sr_id is null");
            return (Criteria) this;
        }

        public Criteria andSrIdIsNotNull() {
            addCriterion("sr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrIdEqualTo(Integer value) {
            addCriterion("sr_id =", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotEqualTo(Integer value) {
            addCriterion("sr_id <>", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdGreaterThan(Integer value) {
            addCriterion("sr_id >", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sr_id >=", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdLessThan(Integer value) {
            addCriterion("sr_id <", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdLessThanOrEqualTo(Integer value) {
            addCriterion("sr_id <=", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdIn(List<Integer> values) {
            addCriterion("sr_id in", values, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotIn(List<Integer> values) {
            addCriterion("sr_id not in", values, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdBetween(Integer value1, Integer value2) {
            addCriterion("sr_id between", value1, value2, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sr_id not between", value1, value2, "srId");
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

        public Criteria andPetsImgIsNull() {
            addCriterion("pets_img is null");
            return (Criteria) this;
        }

        public Criteria andPetsImgIsNotNull() {
            addCriterion("pets_img is not null");
            return (Criteria) this;
        }

        public Criteria andPetsImgEqualTo(String value) {
            addCriterion("pets_img =", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgNotEqualTo(String value) {
            addCriterion("pets_img <>", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgGreaterThan(String value) {
            addCriterion("pets_img >", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgGreaterThanOrEqualTo(String value) {
            addCriterion("pets_img >=", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgLessThan(String value) {
            addCriterion("pets_img <", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgLessThanOrEqualTo(String value) {
            addCriterion("pets_img <=", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgLike(String value) {
            addCriterion("pets_img like", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgNotLike(String value) {
            addCriterion("pets_img not like", value, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgIn(List<String> values) {
            addCriterion("pets_img in", values, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgNotIn(List<String> values) {
            addCriterion("pets_img not in", values, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgBetween(String value1, String value2) {
            addCriterion("pets_img between", value1, value2, "petsImg");
            return (Criteria) this;
        }

        public Criteria andPetsImgNotBetween(String value1, String value2) {
            addCriterion("pets_img not between", value1, value2, "petsImg");
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

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(Integer value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(Integer value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(Integer value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(Integer value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<Integer> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<Integer> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(Integer value1, Integer value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andExpValIsNull() {
            addCriterion("exp_val is null");
            return (Criteria) this;
        }

        public Criteria andExpValIsNotNull() {
            addCriterion("exp_val is not null");
            return (Criteria) this;
        }

        public Criteria andExpValEqualTo(String value) {
            addCriterion("exp_val =", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValNotEqualTo(String value) {
            addCriterion("exp_val <>", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValGreaterThan(String value) {
            addCriterion("exp_val >", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValGreaterThanOrEqualTo(String value) {
            addCriterion("exp_val >=", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValLessThan(String value) {
            addCriterion("exp_val <", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValLessThanOrEqualTo(String value) {
            addCriterion("exp_val <=", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValLike(String value) {
            addCriterion("exp_val like", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValNotLike(String value) {
            addCriterion("exp_val not like", value, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValIn(List<String> values) {
            addCriterion("exp_val in", values, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValNotIn(List<String> values) {
            addCriterion("exp_val not in", values, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValBetween(String value1, String value2) {
            addCriterion("exp_val between", value1, value2, "expVal");
            return (Criteria) this;
        }

        public Criteria andExpValNotBetween(String value1, String value2) {
            addCriterion("exp_val not between", value1, value2, "expVal");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Long value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Long value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Long value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Long value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Long value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Long> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Long> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Long value1, Long value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Long value1, Long value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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