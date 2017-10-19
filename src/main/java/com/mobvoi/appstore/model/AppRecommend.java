package com.mobvoi.appstore.model;

public class AppRecommend {
    private String id;

    private String recommendSimilar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecommendSimilar() {
        return recommendSimilar;
    }

    public void setRecommendSimilar(String recommendSimilar) {
        this.recommendSimilar = recommendSimilar == null ? null : recommendSimilar.trim();
    }
}