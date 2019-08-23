package com.bytedance.android.livesdkapi.depend.model.live;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class RoomAuthStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("Chat")
    public boolean enableChat;
    @SerializedName("Danmaku")
    public boolean enableDanmaku;
    @SerializedName("Digg")
    public boolean enableDigg;
    @SerializedName("Gift")
    public boolean enableGift;
    @SerializedName("LuckMoney")
    private boolean enableLuckMoney;
    @SerializedName("RoomContributor")
    private boolean enableRoomContributor;

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }
}
