package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class Barrage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    private String content;
    @SerializedName("left_diamond")
    private int leftDiamond;
    @SerializedName("msg_id")
    private long msgId;
    @SerializedName("order_id")
    private String orderId;

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }
}
