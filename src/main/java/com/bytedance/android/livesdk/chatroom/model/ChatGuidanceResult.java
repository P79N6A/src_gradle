package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.livesdk.message.model.ay;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ChatGuidanceResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("message")
    private ay message;

    public ay getMessage() {
        return this.message;
    }

    @SerializedName("message")
    public void setMessage(ay ayVar) {
        this.message = ayVar;
    }
}
