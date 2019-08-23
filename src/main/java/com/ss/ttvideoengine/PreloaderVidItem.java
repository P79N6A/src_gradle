package com.ss.ttvideoengine;

public class PreloaderVidItem {
    public boolean mDashEnable;
    public boolean mH265Enable;
    public long mPreloadSize;
    public Resolution mResolution;
    public String mVideoId;

    public PreloaderVidItem(String str, Resolution resolution, long j, boolean z) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mH265Enable = z;
    }
}
