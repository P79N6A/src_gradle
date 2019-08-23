package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    private String activityId;
    @SerializedName("activity_url")
    private UrlModel activityUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("schema")
    private String schema;
    @SerializedName("title")
    private String title;

    public final String getActivityId() {
        return this.activityId;
    }

    public final UrlModel getActivityUrl() {
        return this.activityUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setActivityId(String str) {
        this.activityId = str;
    }

    public final void setActivityUrl(UrlModel urlModel) {
        this.activityUrl = urlModel;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
