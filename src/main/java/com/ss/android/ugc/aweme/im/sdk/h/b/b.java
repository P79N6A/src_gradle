package com.ss.android.ugc.aweme.im.sdk.h.b;

import com.meituan.robust.ChangeQuickRedirect;

public enum b {
    COLUMN_UID("UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR("IS_DISABLE_SHOW_FOLLOW_BAR", "INTEGER NOT NULL"),
    COLUMN_IS_SAY_HELLO_LOGGER("IS_SAY_HELLO_LOGGER", "INTEGER NOT NULL");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public String key;
    public String type;

    private b(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
