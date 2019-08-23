package com.rocket.android.model;

public class FFShareUserData {
    private String avatar;
    private String conversationId;
    private boolean isFromRecommend;
    private String name;
    private Long rocketUId;
    private int type;

    public String getAvatar() {
        return this.avatar;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public Long getMobileId() {
        return this.rocketUId;
    }

    public String getName() {
        return this.name;
    }

    public Long getRocketUId() {
        return this.rocketUId;
    }

    public int getType() {
        return this.type;
    }

    public boolean isFromRecommend() {
        return this.isFromRecommend;
    }

    public String toString() {
        return "FFShareUserData{conversationId='" + this.conversationId + '\'' + ", rocketUId=" + this.rocketUId + ", name='" + this.name + '\'' + ", avatar='" + this.avatar + '\'' + ", type=" + this.type + '}';
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setFromRecommend(boolean z) {
        this.isFromRecommend = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRocketUId(Long l) {
        this.rocketUId = l;
    }

    public void setType(int i) {
        this.type = i;
    }

    public FFShareUserData(Long l, String str, String str2, int i) {
        this.rocketUId = l;
        this.name = str;
        this.avatar = str2;
        this.type = i;
    }

    public FFShareUserData(String str, String str2, String str3, int i) {
        this.conversationId = str;
        this.name = str2;
        this.avatar = str3;
        this.type = i;
    }
}
