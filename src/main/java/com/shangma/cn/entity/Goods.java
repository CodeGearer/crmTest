package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;

public class Goods extends BaseEntity {
    private String baseCategory;

    private String baseBrand;

    private String baseModel;

    private String baseColor;

    private String basePurchase;

    private String baseDistribution;

    private String baseStandby;

    private String goodName;

    private String goodCategory;

    private Double marketPrice;

    private Double mallPrice;

    private Integer minStorage;

    private String purchaseMoudle;


    public String getBaseCategory() {
        return baseCategory;
    }

    public void setBaseCategory(String baseCategory) {
        this.baseCategory = baseCategory == null ? null : baseCategory.trim();
    }

    public String getBaseBrand() {
        return baseBrand;
    }

    public void setBaseBrand(String baseBrand) {
        this.baseBrand = baseBrand == null ? null : baseBrand.trim();
    }

    public String getBaseModel() {
        return baseModel;
    }

    public void setBaseModel(String baseModel) {
        this.baseModel = baseModel == null ? null : baseModel.trim();
    }

    public String getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor == null ? null : baseColor.trim();
    }

    public String getBasePurchase() {
        return basePurchase;
    }

    public void setBasePurchase(String basePurchase) {
        this.basePurchase = basePurchase == null ? null : basePurchase.trim();
    }

    public String getBaseDistribution() {
        return baseDistribution;
    }

    public void setBaseDistribution(String baseDistribution) {
        this.baseDistribution = baseDistribution == null ? null : baseDistribution.trim();
    }

    public String getBaseStandby() {
        return baseStandby;
    }

    public void setBaseStandby(String baseStandby) {
        this.baseStandby = baseStandby == null ? null : baseStandby.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodCategory() {
        return goodCategory;
    }

    public void setGoodCategory(String goodCategory) {
        this.goodCategory = goodCategory == null ? null : goodCategory.trim();
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(Double mallPrice) {
        this.mallPrice = mallPrice;
    }

    public Integer getMinStorage() {
        return minStorage;
    }

    public void setMinStorage(Integer minStorage) {
        this.minStorage = minStorage;
    }

    public String getPurchaseMoudle() {
        return purchaseMoudle;
    }

    public void setPurchaseMoudle(String purchaseMoudle) {
        this.purchaseMoudle = purchaseMoudle == null ? null : purchaseMoudle.trim();
    }
}