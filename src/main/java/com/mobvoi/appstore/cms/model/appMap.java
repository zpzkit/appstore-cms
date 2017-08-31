package com.mobvoi.appstore.cms.model;

import java.math.BigDecimal;

public class appMap {
    private Integer id;

    private String name;

    private String description;

    private Integer developerId;

    private Integer downloadCount;

    private Integer categoryId;

    private String logoUrl;

    private String summary;

    private Boolean isDeleted;

    private String aliasName;

    private String descriptionOrig;

    private String operateNote;

    private String tags;

    private Integer secondCategoryId;

    private Integer thirdCategoryId;

    private Integer createDate;

    private Float score;

    private String apkPackageName;

    private Float rankScore;

    private String recommendSimilar;

    private Boolean wearStandalone;

    private String appFrom;

    private String supportHardware;

    private Boolean needPay;

    private String hardwareTips;

    private Boolean showInWearAppstore;

    private Boolean showInPhoneAppstore;

    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public String getDescriptionOrig() {
        return descriptionOrig;
    }

    public void setDescriptionOrig(String descriptionOrig) {
        this.descriptionOrig = descriptionOrig == null ? null : descriptionOrig.trim();
    }

    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getSecondCategoryId() {
        return secondCategoryId;
    }

    public void setSecondCategoryId(Integer secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    public Integer getThirdCategoryId() {
        return thirdCategoryId;
    }

    public void setThirdCategoryId(Integer thirdCategoryId) {
        this.thirdCategoryId = thirdCategoryId;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getApkPackageName() {
        return apkPackageName;
    }

    public void setApkPackageName(String apkPackageName) {
        this.apkPackageName = apkPackageName == null ? null : apkPackageName.trim();
    }

    public Float getRankScore() {
        return rankScore;
    }

    public void setRankScore(Float rankScore) {
        this.rankScore = rankScore;
    }

    public String getRecommendSimilar() {
        return recommendSimilar;
    }

    public void setRecommendSimilar(String recommendSimilar) {
        this.recommendSimilar = recommendSimilar == null ? null : recommendSimilar.trim();
    }

    public Boolean getWearStandalone() {
        return wearStandalone;
    }

    public void setWearStandalone(Boolean wearStandalone) {
        this.wearStandalone = wearStandalone;
    }

    public String getAppFrom() {
        return appFrom;
    }

    public void setAppFrom(String appFrom) {
        this.appFrom = appFrom == null ? null : appFrom.trim();
    }

    public String getSupportHardware() {
        return supportHardware;
    }

    public void setSupportHardware(String supportHardware) {
        this.supportHardware = supportHardware == null ? null : supportHardware.trim();
    }

    public Boolean getNeedPay() {
        return needPay;
    }

    public void setNeedPay(Boolean needPay) {
        this.needPay = needPay;
    }

    public String getHardwareTips() {
        return hardwareTips;
    }

    public void setHardwareTips(String hardwareTips) {
        this.hardwareTips = hardwareTips == null ? null : hardwareTips.trim();
    }

    public Boolean getShowInWearAppstore() {
        return showInWearAppstore;
    }

    public void setShowInWearAppstore(Boolean showInWearAppstore) {
        this.showInWearAppstore = showInWearAppstore;
    }

    public Boolean getShowInPhoneAppstore() {
        return showInPhoneAppstore;
    }

    public void setShowInPhoneAppstore(Boolean showInPhoneAppstore) {
        this.showInPhoneAppstore = showInPhoneAppstore;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}