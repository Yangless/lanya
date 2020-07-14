package com.nwl.lanya.po;

import java.util.Date;

public class Resouces {
    private String id;

    private String resourceTitle;

    private Date resourceDate;

    private String resourceIntro;

    private String pictureUrl;

    private String accountId;

    private Integer downloadCount;

    private Integer viewCount;

    private Double score;

    private Integer isBoutique;

    private String resourceDetail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle == null ? null : resourceTitle.trim();
    }

    public Date getResourceDate() {
        return resourceDate;
    }

    public void setResourceDate(Date resourceDate) {
        this.resourceDate = resourceDate;
    }

    public String getResourceIntro() {
        return resourceIntro;
    }

    public void setResourceIntro(String resourceIntro) {
        this.resourceIntro = resourceIntro == null ? null : resourceIntro.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getIsBoutique() {
        return isBoutique;
    }

    public void setIsBoutique(Integer isBoutique) {
        this.isBoutique = isBoutique;
    }

    public String getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail == null ? null : resourceDetail.trim();
    }
}