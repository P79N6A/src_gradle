package com.ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class f implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("app_id")
    public String appId;
    @SerializedName("description")
    public String desc;
    @SerializedName("icon")
    public String icon;
    @SerializedName("card")
    public h miniAppCard;
    @SerializedName("app_name")
    public String name;
    @SerializedName("orientation")
    public int orientation;
    @SerializedName("schema")
    public String schema;
    @SerializedName("state")
    public int state;
    @SerializedName("summary")
    public String summary;
    @SerializedName("title")
    public String title;
    @SerializedName("type")
    public int type;

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public h getMiniAppCard() {
        return this.miniAppCard;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isApp() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMiniAppCard(h hVar) {
        this.miniAppCard = hVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
