package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;

public enum da {
    FEED_REQ("feed_req"),
    VIDEO_REQ("video_req"),
    LOAD_MAIN("load_main"),
    FROM_SEND_TO_FIRST("from_send_to_first"),
    FEED_FIRST_VIDEO_PRELOAD("feed_first_video_preload"),
    FEED_FIRST_REQUEST_RESPONSE("feed_first_request_response"),
    FIRST_FRAME("first_frame");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;

    public final String getName() {
        return this.name;
    }

    private da(String str) {
        this.name = str;
    }
}
