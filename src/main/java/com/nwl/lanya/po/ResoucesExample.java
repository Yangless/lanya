package com.nwl.lanya.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResoucesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResoucesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andResourceTitleIsNull() {
            addCriterion("resource_title is null");
            return (Criteria) this;
        }

        public Criteria andResourceTitleIsNotNull() {
            addCriterion("resource_title is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTitleEqualTo(String value) {
            addCriterion("resource_title =", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleNotEqualTo(String value) {
            addCriterion("resource_title <>", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleGreaterThan(String value) {
            addCriterion("resource_title >", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("resource_title >=", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleLessThan(String value) {
            addCriterion("resource_title <", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleLessThanOrEqualTo(String value) {
            addCriterion("resource_title <=", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleLike(String value) {
            addCriterion("resource_title like", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleNotLike(String value) {
            addCriterion("resource_title not like", value, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleIn(List<String> values) {
            addCriterion("resource_title in", values, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleNotIn(List<String> values) {
            addCriterion("resource_title not in", values, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleBetween(String value1, String value2) {
            addCriterion("resource_title between", value1, value2, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceTitleNotBetween(String value1, String value2) {
            addCriterion("resource_title not between", value1, value2, "resourceTitle");
            return (Criteria) this;
        }

        public Criteria andResourceDateIsNull() {
            addCriterion("resource_date is null");
            return (Criteria) this;
        }

        public Criteria andResourceDateIsNotNull() {
            addCriterion("resource_date is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDateEqualTo(Date value) {
            addCriterionForJDBCDate("resource_date =", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("resource_date <>", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("resource_date >", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resource_date >=", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateLessThan(Date value) {
            addCriterionForJDBCDate("resource_date <", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resource_date <=", value, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateIn(List<Date> values) {
            addCriterionForJDBCDate("resource_date in", values, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("resource_date not in", values, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resource_date between", value1, value2, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resource_date not between", value1, value2, "resourceDate");
            return (Criteria) this;
        }

        public Criteria andResourceIntroIsNull() {
            addCriterion("resource_intro is null");
            return (Criteria) this;
        }

        public Criteria andResourceIntroIsNotNull() {
            addCriterion("resource_intro is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIntroEqualTo(String value) {
            addCriterion("resource_intro =", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroNotEqualTo(String value) {
            addCriterion("resource_intro <>", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroGreaterThan(String value) {
            addCriterion("resource_intro >", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroGreaterThanOrEqualTo(String value) {
            addCriterion("resource_intro >=", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroLessThan(String value) {
            addCriterion("resource_intro <", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroLessThanOrEqualTo(String value) {
            addCriterion("resource_intro <=", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroLike(String value) {
            addCriterion("resource_intro like", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroNotLike(String value) {
            addCriterion("resource_intro not like", value, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroIn(List<String> values) {
            addCriterion("resource_intro in", values, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroNotIn(List<String> values) {
            addCriterion("resource_intro not in", values, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroBetween(String value1, String value2) {
            addCriterion("resource_intro between", value1, value2, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andResourceIntroNotBetween(String value1, String value2) {
            addCriterion("resource_intro not between", value1, value2, "resourceIntro");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("picture_url =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("picture_url like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("picture_url not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("picture_url in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNull() {
            addCriterion("download_count is null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIsNotNull() {
            addCriterion("download_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadCountEqualTo(Integer value) {
            addCriterion("download_count =", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotEqualTo(Integer value) {
            addCriterion("download_count <>", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThan(Integer value) {
            addCriterion("download_count >", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_count >=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThan(Integer value) {
            addCriterion("download_count <", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountLessThanOrEqualTo(Integer value) {
            addCriterion("download_count <=", value, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountIn(List<Integer> values) {
            addCriterion("download_count in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotIn(List<Integer> values) {
            addCriterion("download_count not in", values, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountBetween(Integer value1, Integer value2) {
            addCriterion("download_count between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andDownloadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_count not between", value1, value2, "downloadCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueIsNull() {
            addCriterion("is_boutique is null");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueIsNotNull() {
            addCriterion("is_boutique is not null");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueEqualTo(Integer value) {
            addCriterion("is_boutique =", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueNotEqualTo(Integer value) {
            addCriterion("is_boutique <>", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueGreaterThan(Integer value) {
            addCriterion("is_boutique >", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_boutique >=", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueLessThan(Integer value) {
            addCriterion("is_boutique <", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueLessThanOrEqualTo(Integer value) {
            addCriterion("is_boutique <=", value, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueIn(List<Integer> values) {
            addCriterion("is_boutique in", values, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueNotIn(List<Integer> values) {
            addCriterion("is_boutique not in", values, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueBetween(Integer value1, Integer value2) {
            addCriterion("is_boutique between", value1, value2, "isBoutique");
            return (Criteria) this;
        }

        public Criteria andIsBoutiqueNotBetween(Integer value1, Integer value2) {
            addCriterion("is_boutique not between", value1, value2, "isBoutique");
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