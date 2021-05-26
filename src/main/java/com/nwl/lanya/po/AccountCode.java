package com.nwl.lanya.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AccountCode {
	
    private String id;

    private String accountCode;

    private String realName;

    private Date loginTime;

    private Integer resourceTotal;

    private Integer funsTotal;

    private Integer downloadTotal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getResourceTotal() {
        return resourceTotal;
    }

    public void setResourceTotal(Integer resourceTotal) {
        this.resourceTotal = resourceTotal;
    }

    public Integer getFunsTotal() {
        return funsTotal;
    }

    public void setFunsTotal(Integer funsTotal) {
        this.funsTotal = funsTotal;
    }

    public Integer getDownloadTotal() {
        return downloadTotal;
    }

    public void setDownloadTotal(Integer downloadTotal) {
        this.downloadTotal = downloadTotal;
    }
}