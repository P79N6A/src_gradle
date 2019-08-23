package com.bytedance.im.core.b.a.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public enum a {
    COLUMN_ID("combined_key", "TEXT NOT NULL"),
    COLUMN_TYPE("type", "INTEGER"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_MESSAGE_UUID("message_uuid", "TEXT"),
    COLUMN_USER_ID("user_id", "TEXT"),
    COLUMN_ENTITY_ID("entity_id", "TEXT"),
    COLUMN_SEARCH_CONTENT("search_content", "TEXT"),
    COLUMN_EXTRA(PushConstants.EXTRA, "TEXT");
    
    public String key;
    public String type;

    private a(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
