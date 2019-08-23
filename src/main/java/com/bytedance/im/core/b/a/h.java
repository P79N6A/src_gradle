package com.bytedance.im.core.b.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public enum h {
    COLUMN_MSG_ID("property_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("property_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_TARGET_MSG_ID("target_msg_uuid", "TEXT NOT NULL"),
    COLUMN_PROPERTY_TYPE("property_type", "INTEGER"),
    COLUMN_MSG_TYPE("msg_type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_msg", "BIGINT"),
    COLUMN_ORDER_INDEX("order_index", "BIGINT"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_NET_STATUS("net_status", "INTEGER"),
    COLUMN_VERSION("version", "INTEGER"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_CREATE_TIME("created_time", "INTEGER"),
    COLUMN_SENDER("sender", "BIGINT"),
    COLUMN_CONTENT(PushConstants.CONTENT, "TEXT"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_PRORERTY_ID("property_id", "INTEGER"),
    COLUMN_PRORERTY_NAME("property_name", "TEXT"),
    COLUMN_REACTION_STATUS("reaction_status", "INTEGER");
    
    public String key;
    public String type;

    private h(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
