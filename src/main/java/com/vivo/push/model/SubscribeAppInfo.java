package com.vivo.push.model;

public class SubscribeAppInfo {
    private int mActualStatus;
    private String mName;
    private int mTargetStatus;

    public int getActualStatus() {
        return this.mActualStatus;
    }

    public String getName() {
        return this.mName;
    }

    public int getTargetStatus() {
        return this.mTargetStatus;
    }

    public int hashCode() {
        int i;
        if (this.mName == null) {
            i = 0;
        } else {
            i = this.mName.hashCode();
        }
        return ((i + 31) * 31) + this.mTargetStatus;
    }

    public String toString() {
        return "SubscribeAppInfo [mName=" + this.mName + ", mTargetStatus=" + this.mTargetStatus + ", mActualStatus=" + this.mActualStatus + "]";
    }

    public void setActualStatus(int i) {
        this.mActualStatus = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setTargetStatus(int i) {
        this.mTargetStatus = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAppInfo subscribeAppInfo = (SubscribeAppInfo) obj;
        if (this.mName == null) {
            if (subscribeAppInfo.mName != null) {
                return false;
            }
        } else if (!this.mName.equals(subscribeAppInfo.mName)) {
            return false;
        }
        if (this.mTargetStatus == subscribeAppInfo.mTargetStatus) {
            return true;
        }
        return false;
    }

    public SubscribeAppInfo(String str, int i, int i2) {
        this.mName = str;
        this.mTargetStatus = i;
        this.mActualStatus = i2;
    }
}
