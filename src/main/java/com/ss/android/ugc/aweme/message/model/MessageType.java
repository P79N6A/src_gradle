package com.ss.android.ugc.aweme.message.model;

import com.meituan.robust.ChangeQuickRedirect;

public enum MessageType {
    DEFAULT,
    SYSTEM,
    SOCIAL,
    NOTICE,
    LIVE;
    
    public static ChangeQuickRedirect changeQuickRedirect;
}
