package com.ss.android.ugc.aweme.message.model;

import com.google.gson.annotations.SerializedName;

public class NoticeCountMessage extends BaseMessage {
    @SerializedName("author_id")
    public long authorId;
    @SerializedName("item_id")
    public long itemId;
    @SerializedName("msg_id")
    public String msgId;
    @SerializedName("count")
    public int noticeCount;
    @SerializedName("notify_group")
    public int noticeGroup;
    @SerializedName("type")
    public int noticeType;
    @SerializedName("content")
    public StrangerNoticeMessage strangerMessage;

    public NoticeCountMessage() {
        this.msgType = MessageType.NOTICE;
    }
}
