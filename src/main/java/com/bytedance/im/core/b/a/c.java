package com.bytedance.im.core.b.a;

public enum c {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_NAME("name", "TEXT"),
    COLUMN_DESC("desc", "TEXT"),
    COLUMN_ICON("icon", "TEXT"),
    COLUMN_NOTICE("notice", "TEXT"),
    COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
    COLUMN_SEC_OWNER("sec_owner", "TEXT"),
    COLUMN_EXT("ext", "TEXT");
    
    public String key;
    public String type;

    private c(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
