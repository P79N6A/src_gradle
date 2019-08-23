package com.rocket.android.model;

public final class ConversationData {
    private long chatUserUid = -1;
    private final String conversationId;
    private final int conversationType;
    private String coreInfoName;
    private String groupAvatar;
    private long unReadCount;

    public final long getChatUserUid() {
        return this.chatUserUid;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final String getCoreInfoName() {
        return this.coreInfoName;
    }

    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    public final long getUnReadCount() {
        return this.unReadCount;
    }

    public final void setCoreInfoName(String str) {
        this.coreInfoName = str;
    }

    public final void setGroupAvatar(String str) {
        this.groupAvatar = str;
    }

    public final void setUnReadCount(long j) {
        this.unReadCount = j;
    }

    public ConversationData(String str, int i, String str2, String str3, long j, long j2) {
        this.conversationId = str;
        this.conversationType = i;
        this.coreInfoName = str2;
        this.groupAvatar = str3;
        this.unReadCount = j;
        this.chatUserUid = j2;
    }
}
