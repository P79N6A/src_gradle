package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ChatResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("background_image")
    private ImageModel background;
    @SerializedName("content")
    private String content;
    @SerializedName("display_text")
    private e displayText;
    @SerializedName("id")
    private long id;
    @SerializedName("msg_id")
    private long msgId;
    @SerializedName("user")
    private User user;

    public ImageModel getBackground() {
        return this.background;
    }

    public String getContent() {
        return this.content;
    }

    public e getDisplayText() {
        return this.displayText;
    }

    public long getId() {
        return this.id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(e eVar) {
        this.displayText = eVar;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
