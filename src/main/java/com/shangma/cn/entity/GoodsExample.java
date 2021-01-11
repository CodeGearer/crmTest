package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIsNull() {
            addCriterion("base_category is null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIsNotNull() {
            addCriterion("base_category is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryEqualTo(String value) {
            addCriterion("base_category =", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNotEqualTo(String value) {
            addCriterion("base_category <>", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryGreaterThan(String value) {
            addCriterion("base_category >", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("base_category >=", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryLessThan(String value) {
            addCriterion("base_category <", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryLessThanOrEqualTo(String value) {
            addCriterion("base_category <=", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryLike(String value) {
            addCriterion("base_category like", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNotLike(String value) {
            addCriterion("base_category not like", value, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryIn(List<String> values) {
            addCriterion("base_category in", values, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNotIn(List<String> values) {
            addCriterion("base_category not in", values, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryBetween(String value1, String value2) {
            addCriterion("base_category between", value1, value2, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseCategoryNotBetween(String value1, String value2) {
            addCriterion("base_category not between", value1, value2, "baseCategory");
            return (Criteria) this;
        }

        public Criteria andBaseBrandIsNull() {
            addCriterion("base_brand is null");
            return (Criteria) this;
        }

        public Criteria andBaseBrandIsNotNull() {
            addCriterion("base_brand is not null");
            return (Criteria) this;
        }

        public Criteria andBaseBrandEqualTo(String value) {
            addCriterion("base_brand =", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandNotEqualTo(String value) {
            addCriterion("base_brand <>", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandGreaterThan(String value) {
            addCriterion("base_brand >", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandGreaterThanOrEqualTo(String value) {
            addCriterion("base_brand >=", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandLessThan(String value) {
            addCriterion("base_brand <", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandLessThanOrEqualTo(String value) {
            addCriterion("base_brand <=", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandLike(String value) {
            addCriterion("base_brand like", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandNotLike(String value) {
            addCriterion("base_brand not like", value, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandIn(List<String> values) {
            addCriterion("base_brand in", values, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandNotIn(List<String> values) {
            addCriterion("base_brand not in", values, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandBetween(String value1, String value2) {
            addCriterion("base_brand between", value1, value2, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseBrandNotBetween(String value1, String value2) {
            addCriterion("base_brand not between", value1, value2, "baseBrand");
            return (Criteria) this;
        }

        public Criteria andBaseModelIsNull() {
            addCriterion("base_model is null");
            return (Criteria) this;
        }

        public Criteria andBaseModelIsNotNull() {
            addCriterion("base_model is not null");
            return (Criteria) this;
        }

        public Criteria andBaseModelEqualTo(String value) {
            addCriterion("base_model =", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelNotEqualTo(String value) {
            addCriterion("base_model <>", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelGreaterThan(String value) {
            addCriterion("base_model >", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelGreaterThanOrEqualTo(String value) {
            addCriterion("base_model >=", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelLessThan(String value) {
            addCriterion("base_model <", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelLessThanOrEqualTo(String value) {
            addCriterion("base_model <=", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelLike(String value) {
            addCriterion("base_model like", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelNotLike(String value) {
            addCriterion("base_model not like", value, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelIn(List<String> values) {
            addCriterion("base_model in", values, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelNotIn(List<String> values) {
            addCriterion("base_model not in", values, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelBetween(String value1, String value2) {
            addCriterion("base_model between", value1, value2, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseModelNotBetween(String value1, String value2) {
            addCriterion("base_model not between", value1, value2, "baseModel");
            return (Criteria) this;
        }

        public Criteria andBaseColorIsNull() {
            addCriterion("base_color is null");
            return (Criteria) this;
        }

        public Criteria andBaseColorIsNotNull() {
            addCriterion("base_color is not null");
            return (Criteria) this;
        }

        public Criteria andBaseColorEqualTo(String value) {
            addCriterion("base_color =", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorNotEqualTo(String value) {
            addCriterion("base_color <>", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorGreaterThan(String value) {
            addCriterion("base_color >", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorGreaterThanOrEqualTo(String value) {
            addCriterion("base_color >=", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorLessThan(String value) {
            addCriterion("base_color <", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorLessThanOrEqualTo(String value) {
            addCriterion("base_color <=", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorLike(String value) {
            addCriterion("base_color like", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorNotLike(String value) {
            addCriterion("base_color not like", value, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorIn(List<String> values) {
            addCriterion("base_color in", values, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorNotIn(List<String> values) {
            addCriterion("base_color not in", values, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorBetween(String value1, String value2) {
            addCriterion("base_color between", value1, value2, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBaseColorNotBetween(String value1, String value2) {
            addCriterion("base_color not between", value1, value2, "baseColor");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseIsNull() {
            addCriterion("base_purchase is null");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseIsNotNull() {
            addCriterion("base_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseEqualTo(String value) {
            addCriterion("base_purchase =", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseNotEqualTo(String value) {
            addCriterion("base_purchase <>", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseGreaterThan(String value) {
            addCriterion("base_purchase >", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("base_purchase >=", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseLessThan(String value) {
            addCriterion("base_purchase <", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseLessThanOrEqualTo(String value) {
            addCriterion("base_purchase <=", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseLike(String value) {
            addCriterion("base_purchase like", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseNotLike(String value) {
            addCriterion("base_purchase not like", value, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseIn(List<String> values) {
            addCriterion("base_purchase in", values, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseNotIn(List<String> values) {
            addCriterion("base_purchase not in", values, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseBetween(String value1, String value2) {
            addCriterion("base_purchase between", value1, value2, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBasePurchaseNotBetween(String value1, String value2) {
            addCriterion("base_purchase not between", value1, value2, "basePurchase");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionIsNull() {
            addCriterion("base_distribution is null");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionIsNotNull() {
            addCriterion("base_distribution is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionEqualTo(String value) {
            addCriterion("base_distribution =", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionNotEqualTo(String value) {
            addCriterion("base_distribution <>", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionGreaterThan(String value) {
            addCriterion("base_distribution >", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionGreaterThanOrEqualTo(String value) {
            addCriterion("base_distribution >=", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionLessThan(String value) {
            addCriterion("base_distribution <", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionLessThanOrEqualTo(String value) {
            addCriterion("base_distribution <=", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionLike(String value) {
            addCriterion("base_distribution like", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionNotLike(String value) {
            addCriterion("base_distribution not like", value, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionIn(List<String> values) {
            addCriterion("base_distribution in", values, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionNotIn(List<String> values) {
            addCriterion("base_distribution not in", values, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionBetween(String value1, String value2) {
            addCriterion("base_distribution between", value1, value2, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseDistributionNotBetween(String value1, String value2) {
            addCriterion("base_distribution not between", value1, value2, "baseDistribution");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyIsNull() {
            addCriterion("base_standby is null");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyIsNotNull() {
            addCriterion("base_standby is not null");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyEqualTo(String value) {
            addCriterion("base_standby =", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyNotEqualTo(String value) {
            addCriterion("base_standby <>", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyGreaterThan(String value) {
            addCriterion("base_standby >", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyGreaterThanOrEqualTo(String value) {
            addCriterion("base_standby >=", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyLessThan(String value) {
            addCriterion("base_standby <", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyLessThanOrEqualTo(String value) {
            addCriterion("base_standby <=", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyLike(String value) {
            addCriterion("base_standby like", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyNotLike(String value) {
            addCriterion("base_standby not like", value, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyIn(List<String> values) {
            addCriterion("base_standby in", values, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyNotIn(List<String> values) {
            addCriterion("base_standby not in", values, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyBetween(String value1, String value2) {
            addCriterion("base_standby between", value1, value2, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andBaseStandbyNotBetween(String value1, String value2) {
            addCriterion("base_standby not between", value1, value2, "baseStandby");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIsNull() {
            addCriterion("good_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIsNotNull() {
            addCriterion("good_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryEqualTo(String value) {
            addCriterion("good_category =", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotEqualTo(String value) {
            addCriterion("good_category <>", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryGreaterThan(String value) {
            addCriterion("good_category >", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("good_category >=", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLessThan(String value) {
            addCriterion("good_category <", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLessThanOrEqualTo(String value) {
            addCriterion("good_category <=", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryLike(String value) {
            addCriterion("good_category like", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotLike(String value) {
            addCriterion("good_category not like", value, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryIn(List<String> values) {
            addCriterion("good_category in", values, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotIn(List<String> values) {
            addCriterion("good_category not in", values, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryBetween(String value1, String value2) {
            addCriterion("good_category between", value1, value2, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andGoodCategoryNotBetween(String value1, String value2) {
            addCriterion("good_category not between", value1, value2, "goodCategory");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Double value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Double value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Double value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Double value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Double value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Double> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Double> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Double value1, Double value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Double value1, Double value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceIsNull() {
            addCriterion("mall_price is null");
            return (Criteria) this;
        }

        public Criteria andMallPriceIsNotNull() {
            addCriterion("mall_price is not null");
            return (Criteria) this;
        }

        public Criteria andMallPriceEqualTo(Double value) {
            addCriterion("mall_price =", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotEqualTo(Double value) {
            addCriterion("mall_price <>", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThan(Double value) {
            addCriterion("mall_price >", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mall_price >=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThan(Double value) {
            addCriterion("mall_price <", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceLessThanOrEqualTo(Double value) {
            addCriterion("mall_price <=", value, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceIn(List<Double> values) {
            addCriterion("mall_price in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotIn(List<Double> values) {
            addCriterion("mall_price not in", values, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceBetween(Double value1, Double value2) {
            addCriterion("mall_price between", value1, value2, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMallPriceNotBetween(Double value1, Double value2) {
            addCriterion("mall_price not between", value1, value2, "mallPrice");
            return (Criteria) this;
        }

        public Criteria andMinStorageIsNull() {
            addCriterion("min_storage is null");
            return (Criteria) this;
        }

        public Criteria andMinStorageIsNotNull() {
            addCriterion("min_storage is not null");
            return (Criteria) this;
        }

        public Criteria andMinStorageEqualTo(Integer value) {
            addCriterion("min_storage =", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotEqualTo(Integer value) {
            addCriterion("min_storage <>", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageGreaterThan(Integer value) {
            addCriterion("min_storage >", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_storage >=", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageLessThan(Integer value) {
            addCriterion("min_storage <", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageLessThanOrEqualTo(Integer value) {
            addCriterion("min_storage <=", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageIn(List<Integer> values) {
            addCriterion("min_storage in", values, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotIn(List<Integer> values) {
            addCriterion("min_storage not in", values, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageBetween(Integer value1, Integer value2) {
            addCriterion("min_storage between", value1, value2, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("min_storage not between", value1, value2, "minStorage");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleIsNull() {
            addCriterion("purchase_moudle is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleIsNotNull() {
            addCriterion("purchase_moudle is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleEqualTo(String value) {
            addCriterion("purchase_moudle =", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleNotEqualTo(String value) {
            addCriterion("purchase_moudle <>", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleGreaterThan(String value) {
            addCriterion("purchase_moudle >", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_moudle >=", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleLessThan(String value) {
            addCriterion("purchase_moudle <", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleLessThanOrEqualTo(String value) {
            addCriterion("purchase_moudle <=", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleLike(String value) {
            addCriterion("purchase_moudle like", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleNotLike(String value) {
            addCriterion("purchase_moudle not like", value, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleIn(List<String> values) {
            addCriterion("purchase_moudle in", values, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleNotIn(List<String> values) {
            addCriterion("purchase_moudle not in", values, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleBetween(String value1, String value2) {
            addCriterion("purchase_moudle between", value1, value2, "purchaseMoudle");
            return (Criteria) this;
        }

        public Criteria andPurchaseMoudleNotBetween(String value1, String value2) {
            addCriterion("purchase_moudle not between", value1, value2, "purchaseMoudle");
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