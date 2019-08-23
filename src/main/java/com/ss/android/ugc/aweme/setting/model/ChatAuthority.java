package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class ChatAuthority extends BaseResponse {
    @SerializedName("chat_set")
    public int chatSet;
    @SerializedName("chat_setting_open_everyone")
    public boolean chatSettingOpenEveryone;
}
