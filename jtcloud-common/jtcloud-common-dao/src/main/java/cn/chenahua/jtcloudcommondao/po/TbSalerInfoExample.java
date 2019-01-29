package cn.chenahua.jtcloudcommondao.po;

import java.util.ArrayList;
import java.util.List;

public class TbSalerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSalerInfoExample() {
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

        public Criteria andSalerIdIsNull() {
            addCriterion("saler_id is null");
            return (Criteria) this;
        }

        public Criteria andSalerIdIsNotNull() {
            addCriterion("saler_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalerIdEqualTo(Long value) {
            addCriterion("saler_id =", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotEqualTo(Long value) {
            addCriterion("saler_id <>", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThan(Long value) {
            addCriterion("saler_id >", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("saler_id >=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThan(Long value) {
            addCriterion("saler_id <", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThanOrEqualTo(Long value) {
            addCriterion("saler_id <=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdIn(List<Long> values) {
            addCriterion("saler_id in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotIn(List<Long> values) {
            addCriterion("saler_id not in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdBetween(Long value1, Long value2) {
            addCriterion("saler_id between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotBetween(Long value1, Long value2) {
            addCriterion("saler_id not between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerNameIsNull() {
            addCriterion("saler_name is null");
            return (Criteria) this;
        }

        public Criteria andSalerNameIsNotNull() {
            addCriterion("saler_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalerNameEqualTo(String value) {
            addCriterion("saler_name =", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotEqualTo(String value) {
            addCriterion("saler_name <>", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameGreaterThan(String value) {
            addCriterion("saler_name >", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameGreaterThanOrEqualTo(String value) {
            addCriterion("saler_name >=", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLessThan(String value) {
            addCriterion("saler_name <", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLessThanOrEqualTo(String value) {
            addCriterion("saler_name <=", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLike(String value) {
            addCriterion("saler_name like", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotLike(String value) {
            addCriterion("saler_name not like", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameIn(List<String> values) {
            addCriterion("saler_name in", values, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotIn(List<String> values) {
            addCriterion("saler_name not in", values, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameBetween(String value1, String value2) {
            addCriterion("saler_name between", value1, value2, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotBetween(String value1, String value2) {
            addCriterion("saler_name not between", value1, value2, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerLogoIsNull() {
            addCriterion("saler_logo is null");
            return (Criteria) this;
        }

        public Criteria andSalerLogoIsNotNull() {
            addCriterion("saler_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSalerLogoEqualTo(String value) {
            addCriterion("saler_logo =", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoNotEqualTo(String value) {
            addCriterion("saler_logo <>", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoGreaterThan(String value) {
            addCriterion("saler_logo >", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoGreaterThanOrEqualTo(String value) {
            addCriterion("saler_logo >=", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoLessThan(String value) {
            addCriterion("saler_logo <", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoLessThanOrEqualTo(String value) {
            addCriterion("saler_logo <=", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoLike(String value) {
            addCriterion("saler_logo like", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoNotLike(String value) {
            addCriterion("saler_logo not like", value, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoIn(List<String> values) {
            addCriterion("saler_logo in", values, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoNotIn(List<String> values) {
            addCriterion("saler_logo not in", values, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoBetween(String value1, String value2) {
            addCriterion("saler_logo between", value1, value2, "salerLogo");
            return (Criteria) this;
        }

        public Criteria andSalerLogoNotBetween(String value1, String value2) {
            addCriterion("saler_logo not between", value1, value2, "salerLogo");
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