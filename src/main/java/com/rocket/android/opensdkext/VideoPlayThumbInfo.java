package com.rocket.android.opensdkext;

import android.os.Bundle;
import android.text.TextUtils;

public class VideoPlayThumbInfo {
    public long thumbFileLength;
    public long thumbHeight;
    public String thumbUrl;
    public long thumbWidth;

    public VideoPlayThumbInfo() {
    }

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.thumbUrl) || this.thumbHeight < 0 || this.thumbWidth < 0) {
            return false;
        }
        return true;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("ROCKET_VIDEO_PLAY_THUMB_URL", this.thumbUrl);
        bundle.putLong("ROCKET_VIDEO_PLAY_THUMB_WIDTH", this.thumbWidth);
        bundle.putLong("ROCKET_VIDEO_PLAY_THUMB_HEIGHT", this.thumbHeight);
        bundle.putLong("ROCKET_VIDEO_PLAY_THUMB_FILE_LENGTH", this.thumbFileLength);
    }

    public void unserialize(Bundle bundle) {
        this.thumbUrl = bundle.getString("ROCKET_VIDEO_PLAY_THUMB_URL");
        this.thumbWidth = bundle.getLong("ROCKET_VIDEO_PLAY_THUMB_WIDTH");
        this.thumbHeight = bundle.getLong("ROCKET_VIDEO_PLAY_THUMB_HEIGHT");
        this.thumbFileLength = bundle.getLong("ROCKET_VIDEO_PLAY_THUMB_FILE_LENGTH");
    }

    public VideoPlayThumbInfo(String str, long j, long j2, long j3) {
        this.thumbUrl = str;
        this.thumbWidth = j;
        this.thumbHeight = j2;
        this.thumbFileLength = j3;
    }
}
