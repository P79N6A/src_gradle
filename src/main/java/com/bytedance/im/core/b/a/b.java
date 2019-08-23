package com.bytedance.im.core.b.a;

public enum b {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_SHORT_ID("short_id", "BIGINT"),
    COLUMN_CONVERSATION_TYPE("type", "INTEGER"),
    COLUMN_LAST_MSG_INDEX("last_msg_index", "BIGINT"),
    COLUMN_UPDATE_TIME("updated_time", "INTEGER"),
    COLUMN_UNREAD_COUNT("unread_count", "INTEGER"),
    COLUMN_READ_INDEX("read_index", "BIGINT"),
    COLUMN_INBOX("inbox", "INTEGER"),
    COLUMN_MIN_INDEX("min_index", "BIGINT"),
    COLUMN_DRAFT_TIME("drafted_time", "INTEGER"),
    COLUMN_COLUMN_TICKET("ticket", "TEXT"),
    COLUMN_DRAFT_CONTENT("draft_content", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_IS_MEMBER("is_member", "INTEGER"),
    COLUMN_HAS_MORE("has_more", "INTEGER"),
    COLUMN_MEMBER_COUNT("member_count", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_PARTICIPANT("participant", "TEXT");
    
    public String key;
    public String type;

    private b(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
