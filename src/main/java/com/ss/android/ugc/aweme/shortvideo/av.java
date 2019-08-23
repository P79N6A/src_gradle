package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;

public enum av {
    INSTANCE;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private String videoId;

    public final String getVideoId() {
        if (this.videoId == null) {
            return "";
        }
        return this.videoId;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
