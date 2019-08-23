package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import java.util.List;

public class SayHelloContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("stickers")
    private List<a> emoji;
    @SerializedName("nickname")
    private String nickname;

    public List<a> getEmoji() {
        return this.emoji;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setEmoji(List<a> list) {
        this.emoji = list;
    }

    public void setMsgHint(String str) {
        this.msgHint = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
