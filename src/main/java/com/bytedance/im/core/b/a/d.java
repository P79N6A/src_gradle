package com.bytedance.im.core.b.a;

public enum d {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_STICK_TOP("stick_top", "INTEGER"),
    COLUMN_MUTE("mute", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_FAVORITE("favor", "INTEGER");
    
    public String key;
    public String type;

    private d(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
