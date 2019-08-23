package com.bytedance.im.core.b.a;

public enum e {
    COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_IDS_STR("ids_str", "TEXT"),
    COLUMN_SENDER_ID("sender_id", "BIGINT"),
    COLUMN_CREATED_TIME("created_time", "INTEGER");
    
    public String key;
    public String type;

    private e(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
