package com.mobvoi.appstore.model;

public class WeeklyRecommend {
    private Integer id;

    private String editorComment;

    private Integer recTime;

    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEditorComment() {
        return editorComment;
    }

    public void setEditorComment(String editorComment) {
        this.editorComment = editorComment == null ? null : editorComment.trim();
    }

    public Integer getRecTime() {
        return recTime;
    }

    public void setRecTime(Integer recTime) {
        this.recTime = recTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}