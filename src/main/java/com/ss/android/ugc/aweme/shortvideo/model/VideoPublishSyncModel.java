package com.ss.android.ugc.aweme.shortvideo.model;

public class VideoPublishSyncModel {
    public int mIconId;
    public String mSyncName;
    public int mType;

    public VideoPublishSyncModel(int i, String str, int i2) {
        this.mType = i;
        this.mSyncName = str;
        this.mIconId = i2;
    }
}
