package com.ss.ttvideoengine.preloader;

public class TTAVPreloaderItem {
    public String[] mBackUpUrls;
    public long mCurFileSize;
    public int mCurUrlIndex;
    public String mFileHash;
    public String mFileKey;
    public String mFilePath;
    public long mFileSize;
    public int mHeight;
    public int mResolution;
    public long mSupportResMask;
    public String mUrl;
    public long mUrlTime;
    public String mVideoID;
    public int mWidth;

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3, String str5) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFileHash = str5;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3, String str5, long j3, long j4) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFileHash = str5;
        this.mCurFileSize = j3;
        this.mFileSize = j4;
    }
}
