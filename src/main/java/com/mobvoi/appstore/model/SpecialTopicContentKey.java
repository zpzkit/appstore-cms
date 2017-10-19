package com.mobvoi.appstore.model;

public class SpecialTopicContentKey {
    private Integer topicId;

    private String topicCategoryName;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicCategoryName() {
        return topicCategoryName;
    }

    public void setTopicCategoryName(String topicCategoryName) {
        this.topicCategoryName = topicCategoryName == null ? null : topicCategoryName.trim();
    }
}