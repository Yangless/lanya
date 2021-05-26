package com.nwl.lanya.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountCodeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNull() {
            addCriterion("account_code is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNotNull() {
            addCriterion("account_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeEqualTo(String value) {
            addCriterion("account_code =", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotEqualTo(String value) {
            addCriterion("account_code <>", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThan(String value) {
            addCriterion("account_code >", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("account_code >=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThan(String value) {
            addCriterion("account_code <", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("account_code <=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLike(String value) {
            addCriterion("account_code like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotLike(String value) {
            addCriterion("account_code not like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIn(List<String> values) {
            addCriterion("account_code in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotIn(List<String> values) {
            addCriterion("account_code not in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeBetween(String value1, String value2) {
            addCriterion("account_code between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotBetween(String value1, String value2) {
            addCriterion("account_code not between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andResourceTotalIsNull() {
            addCriterion("resource_total is null");
            return (Criteria) this;
        }

        public Criteria andResourceTotalIsNotNull() {
            addCriterion("resource_total is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTotalEqualTo(Integer value) {
            addCriterion("resource_total =", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalNotEqualTo(Integer value) {
            addCriterion("resource_total <>", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalGreaterThan(Integer value) {
            addCriterion("resource_total >", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_total >=", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalLessThan(Integer value) {
            addCriterion("resource_total <", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalLessThanOrEqualTo(Integer value) {
            addCriterion("resource_total <=", value, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalIn(List<Integer> values) {
            addCriterion("resource_total in", values, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalNotIn(List<Integer> values) {
            addCriterion("resource_total not in", values, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalBetween(Integer value1, Integer value2) {
            addCriterion("resource_total between", value1, value2, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andResourceTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_total not between", value1, value2, "resourceTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalIsNull() {
            addCriterion("funs_total is null");
            return (Criteria) this;
        }

        public Criteria andFunsTotalIsNotNull() {
            addCriterion("funs_total is not null");
            return (Criteria) this;
        }

        public Criteria andFunsTotalEqualTo(Integer value) {
            addCriterion("funs_total =", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalNotEqualTo(Integer value) {
            addCriterion("funs_total <>", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalGreaterThan(Integer value) {
            addCriterion("funs_total >", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("funs_total >=", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalLessThan(Integer value) {
            addCriterion("funs_total <", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalLessThanOrEqualTo(Integer value) {
            addCriterion("funs_total <=", value, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalIn(List<Integer> values) {
            addCriterion("funs_total in", values, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalNotIn(List<Integer> values) {
            addCriterion("funs_total not in", values, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalBetween(Integer value1, Integer value2) {
            addCriterion("funs_total between", value1, value2, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andFunsTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("funs_total not between", value1, value2, "funsTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalIsNull() {
            addCriterion("download_total is null");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalIsNotNull() {
            addCriterion("download_total is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalEqualTo(Integer value) {
            addCriterion("download_total =", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalNotEqualTo(Integer value) {
            addCriterion("download_total <>", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalGreaterThan(Integer value) {
            addCriterion("download_total >", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_total >=", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalLessThan(Integer value) {
            addCriterion("download_total <", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalLessThanOrEqualTo(Integer value) {
            addCriterion("download_total <=", value, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalIn(List<Integer> values) {
            addCriterion("download_total in", values, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalNotIn(List<Integer> values) {
            addCriterion("download_total not in", values, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalBetween(Integer value1, Integer value2) {
            addCriterion("download_total between", value1, value2, "downloadTotal");
            return (Criteria) this;
        }

        public Criteria andDownloadTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("download_total not between", value1, value2, "downloadTotal");
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