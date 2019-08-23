package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;

public class EPlatformCardContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actions")
    public Map<String, LinkItem> actions;
    @SerializedName("content")
    public String content;
    @SerializedName("push_detail")
    public String pushDetail;

    public static class ExtraParams {
        @SerializedName("show_more_button")
        public String showMoreButton;
    }

    public static class LinkItem {
        @SerializedName("action_type")
        public int actionType;
        @SerializedName("ext_params")
        public ExtraParams extraParams;
        @SerializedName("name")
        public String name;
        @SerializedName("phone_encrypt_key")
        public String phoneEncryptKey;
        @SerializedName("phone_instance_id")
        public String phoneInstanceId;
        @SerializedName("phone_number")
        public String phoneNumber;
        @SerializedName("value")
        public String value;
    }

    public String getMsgHint() {
        return this.pushDetail;
    }
}
