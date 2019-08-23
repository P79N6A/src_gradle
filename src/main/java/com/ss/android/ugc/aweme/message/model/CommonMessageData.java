package com.ss.android.ugc.aweme.message.model;

import com.google.gson.annotations.SerializedName;

public class CommonMessageData {
    @SerializedName("create_time")
    public long createTime;
    @SerializedName("msg_id")
    public long messageId;
    @SerializedName("method")
    public String method;
    @SerializedName("play_time")
    public long playTime;
    @SerializedName("room_id")
    public long roomId;
    @SerializedName("is_show_msg")
    public boolean showMsg;
}
