package com.ss.android.ugc.aweme.message.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class LiveMessage extends BaseMessage {
    @SerializedName("anchor_avatar")
    public UrlModel anchorAvatar;
    @SerializedName("anchor_id")
    public String anchorId;
    @SerializedName("type")
    public int liveMessageType;

    public LiveMessage() {
        this.msgType = MessageType.LIVE;
    }
}
