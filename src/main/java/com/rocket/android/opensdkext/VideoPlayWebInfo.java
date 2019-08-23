package com.rocket.android.opensdkext;

import android.os.Bundle;
import android.text.TextUtils;

public class VideoPlayWebInfo {
    public String webContent;
    public String webThumbUrl;
    public String webTitle;
    public String webUrl;

    public VideoPlayWebInfo() {
    }

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.webUrl) || TextUtils.isEmpty(this.webTitle)) {
            return false;
        }
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("ROCKET_VIDEO_PLAY_WEB_URL", this.webUrl);
        bundle.putString("ROCKET_VIDEO_PLAY_WEB_TITLE", this.webTitle);
        bundle.putString("ROCKET_VIDEO_PLAY_WEB_CONTENT", this.webContent);
        bundle.putString("ROCKET_VIDEO_PLAY_WEB_THUMB_URL", this.webThumbUrl);
    }

    public void unserialize(Bundle bundle) {
        this.webUrl = bundle.getString("ROCKET_VIDEO_PLAY_WEB_URL");
        this.webTitle = bundle.getString("ROCKET_VIDEO_PLAY_WEB_TITLE");
        this.webContent = bundle.getString("ROCKET_VIDEO_PLAY_WEB_CONTENT");
        this.webThumbUrl = bundle.getString("ROCKET_VIDEO_PLAY_WEB_THUMB_URL");
    }

    public VideoPlayWebInfo(String str, String str2, String str3, String str4) {
        this.webUrl = str;
        this.webTitle = str2;
        this.webContent = str3;
        this.webThumbUrl = str4;
    }
}
