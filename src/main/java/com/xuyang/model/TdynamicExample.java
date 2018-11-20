package com.xuyang.model;

import java.util.ArrayList;
import java.util.List;

public class TdynamicExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public TdynamicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
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

        public Criteria andDyIdIsNull() {
            addCriterion("dy_id is null");
            return (Criteria) this;
        }

        public Criteria andDyIdIsNotNull() {
            addCriterion("dy_id is not null");
            return (Criteria) this;
        }

        public Criteria andDyIdEqualTo(Integer value) {
            addCriterion("dy_id =", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotEqualTo(Integer value) {
            addCriterion("dy_id <>", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdGreaterThan(Integer value) {
            addCriterion("dy_id >", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dy_id >=", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdLessThan(Integer value) {
            addCriterion("dy_id <", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdLessThanOrEqualTo(Integer value) {
            addCriterion("dy_id <=", value, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdIn(List<Integer> values) {
            addCriterion("dy_id in", values, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotIn(List<Integer> values) {
            addCriterion("dy_id not in", values, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdBetween(Integer value1, Integer value2) {
            addCriterion("dy_id between", value1, value2, "dyId");
            return (Criteria) this;
        }

        public Criteria andDyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dy_id not between", value1, value2, "dyId");
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

        public Criteria andDyTitleIsNull() {
            addCriterion("dy_title is null");
            return (Criteria) this;
        }

        public Criteria andDyTitleIsNotNull() {
            addCriterion("dy_title is not null");
            return (Criteria) this;
        }

        public Criteria andDyTitleEqualTo(String value) {
            addCriterion("dy_title =", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotEqualTo(String value) {
            addCriterion("dy_title <>", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleGreaterThan(String value) {
            addCriterion("dy_title >", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("dy_title >=", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLessThan(String value) {
            addCriterion("dy_title <", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLessThanOrEqualTo(String value) {
            addCriterion("dy_title <=", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleLike(String value) {
            addCriterion("dy_title like", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotLike(String value) {
            addCriterion("dy_title not like", value, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleIn(List<String> values) {
            addCriterion("dy_title in", values, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotIn(List<String> values) {
            addCriterion("dy_title not in", values, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleBetween(String value1, String value2) {
            addCriterion("dy_title between", value1, value2, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyTitleNotBetween(String value1, String value2) {
            addCriterion("dy_title not between", value1, value2, "dyTitle");
            return (Criteria) this;
        }

        public Criteria andDyImageIsNull() {
            addCriterion("dy_image is null");
            return (Criteria) this;
        }

        public Criteria andDyImageIsNotNull() {
            addCriterion("dy_image is not null");
            return (Criteria) this;
        }

        public Criteria andDyImageEqualTo(String value) {
            addCriterion("dy_image =", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageNotEqualTo(String value) {
            addCriterion("dy_image <>", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageGreaterThan(String value) {
            addCriterion("dy_image >", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageGreaterThanOrEqualTo(String value) {
            addCriterion("dy_image >=", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageLessThan(String value) {
            addCriterion("dy_image <", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageLessThanOrEqualTo(String value) {
            addCriterion("dy_image <=", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageLike(String value) {
            addCriterion("dy_image like", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageNotLike(String value) {
            addCriterion("dy_image not like", value, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageIn(List<String> values) {
            addCriterion("dy_image in", values, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageNotIn(List<String> values) {
            addCriterion("dy_image not in", values, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageBetween(String value1, String value2) {
            addCriterion("dy_image between", value1, value2, "dyImage");
            return (Criteria) this;
        }

        public Criteria andDyImageNotBetween(String value1, String value2) {
            addCriterion("dy_image not between", value1, value2, "dyImage");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNull() {
            addCriterion("global_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIsNotNull() {
            addCriterion("global_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalIdEqualTo(Integer value) {
            addCriterion("global_id =", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotEqualTo(Integer value) {
            addCriterion("global_id <>", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThan(Integer value) {
            addCriterion("global_id >", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("global_id >=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThan(Integer value) {
            addCriterion("global_id <", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdLessThanOrEqualTo(Integer value) {
            addCriterion("global_id <=", value, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdIn(List<Integer> values) {
            addCriterion("global_id in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotIn(List<Integer> values) {
            addCriterion("global_id not in", values, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdBetween(Integer value1, Integer value2) {
            addCriterion("global_id between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andGlobalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("global_id not between", value1, value2, "globalId");
            return (Criteria) this;
        }

        public Criteria andDyStatusIsNull() {
            addCriterion("dy_status is null");
            return (Criteria) this;
        }

        public Criteria andDyStatusIsNotNull() {
            addCriterion("dy_status is not null");
            return (Criteria) this;
        }

        public Criteria andDyStatusEqualTo(Integer value) {
            addCriterion("dy_status =", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusNotEqualTo(Integer value) {
            addCriterion("dy_status <>", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusGreaterThan(Integer value) {
            addCriterion("dy_status >", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dy_status >=", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusLessThan(Integer value) {
            addCriterion("dy_status <", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dy_status <=", value, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusIn(List<Integer> values) {
            addCriterion("dy_status in", values, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusNotIn(List<Integer> values) {
            addCriterion("dy_status not in", values, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusBetween(Integer value1, Integer value2) {
            addCriterion("dy_status between", value1, value2, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dy_status not between", value1, value2, "dyStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusIsNull() {
            addCriterion("dy_audit_status is null");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusIsNotNull() {
            addCriterion("dy_audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusEqualTo(Integer value) {
            addCriterion("dy_audit_status =", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusNotEqualTo(Integer value) {
            addCriterion("dy_audit_status <>", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusGreaterThan(Integer value) {
            addCriterion("dy_audit_status >", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dy_audit_status >=", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusLessThan(Integer value) {
            addCriterion("dy_audit_status <", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dy_audit_status <=", value, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusIn(List<Integer> values) {
            addCriterion("dy_audit_status in", values, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusNotIn(List<Integer> values) {
            addCriterion("dy_audit_status not in", values, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("dy_audit_status between", value1, value2, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dy_audit_status not between", value1, value2, "dyAuditStatus");
            return (Criteria) this;
        }

        public Criteria andDyRemarkIsNull() {
            addCriterion("dy_remark is null");
            return (Criteria) this;
        }

        public Criteria andDyRemarkIsNotNull() {
            addCriterion("dy_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDyRemarkEqualTo(String value) {
            addCriterion("dy_remark =", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkNotEqualTo(String value) {
            addCriterion("dy_remark <>", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkGreaterThan(String value) {
            addCriterion("dy_remark >", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dy_remark >=", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkLessThan(String value) {
            addCriterion("dy_remark <", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkLessThanOrEqualTo(String value) {
            addCriterion("dy_remark <=", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkLike(String value) {
            addCriterion("dy_remark like", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkNotLike(String value) {
            addCriterion("dy_remark not like", value, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkIn(List<String> values) {
            addCriterion("dy_remark in", values, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkNotIn(List<String> values) {
            addCriterion("dy_remark not in", values, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkBetween(String value1, String value2) {
            addCriterion("dy_remark between", value1, value2, "dyRemark");
            return (Criteria) this;
        }

        public Criteria andDyRemarkNotBetween(String value1, String value2) {
            addCriterion("dy_remark not between", value1, value2, "dyRemark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dynamic
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dynamic
     *
     * @mbg.generated
     */
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