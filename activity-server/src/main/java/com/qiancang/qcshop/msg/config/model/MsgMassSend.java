package com.qiancang.qcshop.msg.config.model;

import java.util.Date;

public class MsgMassSend {
    private Long id;

    private Byte sendType;

    private String templateCode;

    private Date pushTime;

    private String url;

    private Byte type;

    private Integer jumpNo;

    private Integer jumpId;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private String remark;

    private String targetUserPhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getSendType() {
        return sendType;
    }

    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getJumpNo() {
        return jumpNo;
    }

    public void setJumpNo(Integer jumpNo) {
        this.jumpNo = jumpNo;
    }

    public Integer getJumpId() {
        return jumpId;
    }

    public void setJumpId(Integer jumpId) {
        this.jumpId = jumpId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTargetUserPhone() {
        return targetUserPhone;
    }

    public void setTargetUserPhone(String targetUserPhone) {
        this.targetUserPhone = targetUserPhone == null ? null : targetUserPhone.trim();
    }
}