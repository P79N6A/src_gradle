package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;

public enum p {
    IO,
    DEFAULT,
    BACKGROUND,
    SCHEDULED,
    SERIAL,
    FIXED;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
