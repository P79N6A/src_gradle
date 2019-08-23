package com.rocket.android.model;

public final class FFMsgData {
    private String content;
    private long createAtTime;

    public final String getContent() {
        return this.content;
    }

    public final long getCreateAtTime() {
        return this.createAtTime;
    }

    public final String toString() {
        return "FFMsgData{createAtTime=" + this.createAtTime + ", content='" + this.content + '\'' + '}';
    }

    public FFMsgData(long j, String str) {
        this.createAtTime = j;
        this.content = str;
    }
}
