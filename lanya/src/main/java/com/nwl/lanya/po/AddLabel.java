package com.nwl.lanya.po;

public class AddLabel {
    private String id;

    private String resourceId;

    private String lableInfoId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getLableInfoId() {
        return lableInfoId;
    }

    public void setLableInfoId(String lableInfoId) {
        this.lableInfoId = lableInfoId == null ? null : lableInfoId.trim();
    }
}