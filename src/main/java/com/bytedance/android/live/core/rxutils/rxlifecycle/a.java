package com.bytedance.android.live.core.rxutils.rxlifecycle;

import com.meituan.robust.ChangeQuickRedirect;

public enum a {
    ATTACH,
    CREATE,
    CREATE_VIEW,
    START,
    RESUME,
    PAUSE,
    STOP,
    DESTROY_VIEW,
    DESTROY,
    DETACH;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
