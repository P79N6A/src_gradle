package com.bytedance.im.core.b.a;

public enum a {
    COLUMN_UUID("uuid", "TEXT NOT NULL"),
    COLUMN_LOCAL_URI("local_uri", "TEXT"),
    COLUMN_REMOTE_URI("remote_uri", "TEXT"),
    COLUMN_SIZE("size", "BIGINT"),
    COLUMN_TYPE("type", "TEXT"),
    COLUMN_HASH("hash", "TEXT"),
    COLUMN_INDEX("position", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
    COLUMN_MIME_TYPE("mime_type", "TEXT");
    
    public String key;
    public String type;

    private a(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
