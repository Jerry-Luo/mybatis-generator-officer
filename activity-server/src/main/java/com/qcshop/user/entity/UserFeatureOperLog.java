package com.qcshop.user.entity;

import java.util.Date;

public class UserFeatureOperLog {
    private Long id;

    private Long userFeatureId;

    private String operator;

    private String operContent;

    private Date operTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserFeatureId() {
        return userFeatureId;
    }

    public void setUserFeatureId(Long userFeatureId) {
        this.userFeatureId = userFeatureId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperContent() {
        return operContent;
    }

    public void setOperContent(String operContent) {
        this.operContent = operContent == null ? null : operContent.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }
}