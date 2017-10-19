package com.mobvoi.appstore.model;

public class AppRecSim {
    private Integer id;

    private String recommendSimilar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecommendSimilar() {
        return recommendSimilar;
    }

    public void setRecommendSimilar(String recommendSimilar) {
        this.recommendSimilar = recommendSimilar == null ? null : recommendSimilar.trim();
    }
}