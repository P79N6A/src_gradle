package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;

public class MicroAppStruct {
    @SerializedName("app_id")
    public String appId;
    @SerializedName("app_name")
    public String appName;
    @SerializedName("icon")
    public String icon;
    @SerializedName("orientation")
    public int orientation;
    @SerializedName("schema")
    public String schema;
    @SerializedName("state")
    public int state;
    @SerializedName("summary")
    public String summary;
    @SerializedName("type")
    public int type;
}
