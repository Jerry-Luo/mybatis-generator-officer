package com.qiancang.qcshop.msg.config.model;

import java.util.Date;

public class MsgTemplate {
    private Long id;

    private String msgTypeCode;

    private String msgTypeName;

    private Byte sendSms;

    private Byte appPush;

    private Byte appletMsg;

    private Byte stationLetter;

    private String configIndicator;

    private String aliSmsTemplateId;

    private String txSmsTemplateId;

    private String appletTemplateId;

    private String appletRedirectPage;

    private String msgSubject;

    private String msgContent;

    private Byte promoteSms;

    private String promoteSmsContent;

    private String remark;

    private Byte templateType;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private Byte deleted;

    private String jumpInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgTypeCode() {
        return msgTypeCode;
    }

    public void setMsgTypeCode(String msgTypeCode) {
        this.msgTypeCode = msgTypeCode == null ? null : msgTypeCode.trim();
    }

    public String getMsgTypeName() {
        return msgTypeName;
    }

    public void setMsgTypeName(String msgTypeName) {
        this.msgTypeName = msgTypeName == null ? null : msgTypeName.trim();
    }

    public Byte getSendSms() {
        return sendSms;
    }

    public void setSendSms(Byte sendSms) {
        this.sendSms = sendSms;
    }

    public Byte getAppPush() {
        return appPush;
    }

    public void setAppPush(Byte appPush) {
        this.appPush = appPush;
    }

    public Byte getAppletMsg() {
        return appletMsg;
    }

    public void setAppletMsg(Byte appletMsg) {
        this.appletMsg = appletMsg;
    }

    public Byte getStationLetter() {
        return stationLetter;
    }

    public void setStationLetter(Byte stationLetter) {
        this.stationLetter = stationLetter;
    }

    public String getConfigIndicator() {
        return configIndicator;
    }

    public void setConfigIndicator(String configIndicator) {
        this.configIndicator = configIndicator == null ? null : configIndicator.trim();
    }

    public String getAliSmsTemplateId() {
        return aliSmsTemplateId;
    }

    public void setAliSmsTemplateId(String aliSmsTemplateId) {
        this.aliSmsTemplateId = aliSmsTemplateId == null ? null : aliSmsTemplateId.trim();
    }

    public String getTxSmsTemplateId() {
        return txSmsTemplateId;
    }

    public void setTxSmsTemplateId(String txSmsTemplateId) {
        this.txSmsTemplateId = txSmsTemplateId == null ? null : txSmsTemplateId.trim();
    }

    public String getAppletTemplateId() {
        return appletTemplateId;
    }

    public void setAppletTemplateId(String appletTemplateId) {
        this.appletTemplateId = appletTemplateId == null ? null : appletTemplateId.trim();
    }

    public String getAppletRedirectPage() {
        return appletRedirectPage;
    }

    public void setAppletRedirectPage(String appletRedirectPage) {
        this.appletRedirectPage = appletRedirectPage == null ? null : appletRedirectPage.trim();
    }

    public String getMsgSubject() {
        return msgSubject;
    }

    public void setMsgSubject(String msgSubject) {
        this.msgSubject = msgSubject == null ? null : msgSubject.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public Byte getPromoteSms() {
        return promoteSms;
    }

    public void setPromoteSms(Byte promoteSms) {
        this.promoteSms = promoteSms;
    }

    public String getPromoteSmsContent() {
        return promoteSmsContent;
    }

    public void setPromoteSmsContent(String promoteSmsContent) {
        this.promoteSmsContent = promoteSmsContent == null ? null : promoteSmsContent.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
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

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getJumpInfo() {
        return jumpInfo;
    }

    public void setJumpInfo(String jumpInfo) {
        this.jumpInfo = jumpInfo == null ? null : jumpInfo.trim();
    }
}