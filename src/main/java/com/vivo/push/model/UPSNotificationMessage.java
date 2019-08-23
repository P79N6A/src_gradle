package com.vivo.push.model;

import java.util.HashMap;
import java.util.Map;

public class UPSNotificationMessage {
    private String mContent;
    private String mCoverUrl;
    private String mIconUrl;
    private long mMsgId;
    private int mNotifyType;
    private Map<String, String> mParams = new HashMap();
    private String mPurePicUrl;
    private boolean mShowTime;
    private String mSkipContent;
    private int mSkipType;
    private int mTargetType;
    private String mTitle;
    private String mTragetContent;

    public String getContent() {
        return this.mContent;
    }

    public String getCoverUrl() {
        return this.mCoverUrl;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public long getMsgId() {
        return this.mMsgId;
    }

    public int getNotifyType() {
        return this.mNotifyType;
    }

    public Map<String, String> getParams() {
        return this.mParams;
    }

    public String getPurePicUrl() {
        return this.mPurePicUrl;
    }

    public String getSkipContent() {
        return this.mSkipContent;
    }

    public int getSkipType() {
        return this.mSkipType;
    }

    public int getTargetType() {
        return this.mTargetType;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getTragetContent() {
        return this.mTragetContent;
    }

    public boolean isShowTime() {
        return this.mShowTime;
    }

    public void clearCoverUrl() {
        this.mIconUrl = "";
    }

    public void clearPurePicUrl() {
        this.mPurePicUrl = "";
    }

    public String toString() {
        return "UPSNotificationMessage{mTargetType=" + this.mTargetType + ", mTragetContent='" + this.mTragetContent + '\'' + ", mTitle='" + this.mTitle + '\'' + ", mContent='" + this.mContent + '\'' + ", mNotifyType=" + this.mNotifyType + ", mPurePicUrl='" + this.mPurePicUrl + '\'' + ", mIconUrl='" + this.mIconUrl + '\'' + ", mCoverUrl='" + this.mCoverUrl + '\'' + ", mSkipContent='" + this.mSkipContent + '\'' + ", mSkipType=" + this.mSkipType + ", mShowTime=" + this.mShowTime + ", mMsgId=" + this.mMsgId + ", mParams=" + this.mParams + '}';
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setCoverUrl(String str) {
        this.mCoverUrl = str;
    }

    public void setIconUrl(String str) {
        this.mIconUrl = str;
    }

    public void setMsgId(long j) {
        this.mMsgId = j;
    }

    public void setNotifyType(int i) {
        this.mNotifyType = i;
    }

    public void setParams(Map<String, String> map) {
        this.mParams = map;
    }

    public void setPurePicUrl(String str) {
        this.mPurePicUrl = str;
    }

    public void setShowTime(boolean z) {
        this.mShowTime = z;
    }

    public void setSkipContent(String str) {
        this.mSkipContent = str;
    }

    public void setSkipType(int i) {
        this.mSkipType = i;
    }

    public void setTargetType(int i) {
        this.mTargetType = i;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTragetContext(String str) {
        this.mTragetContent = str;
    }
}
