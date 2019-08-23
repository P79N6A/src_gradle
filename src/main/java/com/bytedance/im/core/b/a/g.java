package com.bytedance.im.core.b.a;

import com.ss.android.ugc.aweme.app.c;

public enum g {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_SORT_ORDER("sort_order", "INTEGER"),
    COLUMN_ROLE("role", "INTEGER"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_ALIAS("alias", "TEXT"),
    COLUMN_SEC_UID(c.f33976b, "TEXT");
    
    public String key;
    public String type;

    private g(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
