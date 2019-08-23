package com.ss.android.excitingvideo.model;

import org.json.JSONObject;

public class ShareInfo {
    private String mShareDesc;
    private String mShareIcon;
    private String mShareTitle;
    private String mShareUrl;

    public String getShareDesc() {
        return this.mShareDesc;
    }

    public String getShareIcon() {
        return this.mShareIcon;
    }

    public String getShareTitle() {
        return this.mShareTitle;
    }

    public String getShareUrl() {
        return this.mShareUrl;
    }

    public ShareInfo(JSONObject jSONObject) {
        this.mShareTitle = jSONObject.optString("share_title");
        this.mShareDesc = jSONObject.optString("share_desc");
        this.mShareIcon = jSONObject.optString("share_icon");
        this.mShareUrl = jSONObject.optString("share_url");
    }
}
