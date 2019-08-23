package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class FloatingCardInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 42;
    @SerializedName("button_bg")
    public UrlModel buttonBackground;
    @SerializedName("button_desc")
    public String buttonDesc;
    @SerializedName("description")
    public String description;
    @SerializedName("icons")
    public List<UrlModel> icons;
    @SerializedName("schema")
    public String schema;
    @SerializedName("schema_desc")
    public String schemaDesc;
    @SerializedName("title")
    public String title;

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
