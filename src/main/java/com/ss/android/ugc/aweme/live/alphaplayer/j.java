package com.ss.android.ugc.aweme.live.alphaplayer;

import com.meituan.robust.ChangeQuickRedirect;

public enum j {
    NOT_PREPARED,
    PREPARED,
    STARTED,
    PAUSED,
    STOPPED,
    RELEASE;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
