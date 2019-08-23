package com.bytedance.android.livesdk.chatroom.interact.data;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class LinkAutoMatchModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("default_avatar")
    private ImageModel defaultAvatar;
    @SerializedName("default_content")
    private String defaultContent;
    @SerializedName("rival_room")
    private Room rivalRoom;
    @SerializedName("rival_user_id")
    private long rivalUserId;

    public ImageModel getDefaultAvatar() {
        return this.defaultAvatar;
    }

    public String getDefaultContent() {
        return this.defaultContent;
    }

    public Room getRivalRoom() {
        return this.rivalRoom;
    }

    public long getRivalUserId() {
        return this.rivalUserId;
    }

    public void setDefaultAvatar(ImageModel imageModel) {
        this.defaultAvatar = imageModel;
    }

    public void setDefaultContent(String str) {
        this.defaultContent = str;
    }

    public void setRivalRoom(Room room) {
        this.rivalRoom = room;
    }

    public void setRivalUserId(long j) {
        this.rivalUserId = j;
    }
}
