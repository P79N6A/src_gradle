package com.vivo.push.model;

public class InsideNotificationItem extends UPSNotificationMessage {
    private int mAppType;
    private boolean mIsShowBigPicOnMobileNet;
    private int mMessageType;
    private String mReactPackage;
    private String mSuitReactVersion;

    public int getAppType() {
        return this.mAppType;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    public String getReactPackage() {
        return this.mReactPackage;
    }

    public String getSuitReactVersion() {
        return this.mSuitReactVersion;
    }

    public boolean isShowBigPicOnMobileNet() {
        return this.mIsShowBigPicOnMobileNet;
    }

    public void setAppType(int i) {
        this.mAppType = i;
    }

    public void setIsShowBigPicOnMobileNet(boolean z) {
        this.mIsShowBigPicOnMobileNet = z;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public void setReactPackage(String str) {
        this.mReactPackage = str;
    }

    public void setSuitReactVersion(String str) {
        this.mSuitReactVersion = str;
    }
}
