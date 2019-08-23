package com.bytedance.android.livesdkapi.depend.d;

import com.meituan.robust.ChangeQuickRedirect;

public enum q {
    IDLE,
    INITIALIZED,
    PREPARING,
    PREPARED,
    LIVE_STARTED,
    LIVE_FINISHED;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
