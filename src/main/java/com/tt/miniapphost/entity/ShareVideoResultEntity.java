package com.tt.miniapphost.entity;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class ShareVideoResultEntity {
    private String mShareVideoFailReason;
    private boolean mShareVideoResult;
    private boolean shouldHandle;

    @AnyProcess
    public String getShareVideoFailReason() {
        return this.mShareVideoFailReason;
    }

    @AnyProcess
    public boolean getShareVideoResult() {
        return this.mShareVideoResult;
    }

    @AnyProcess
    public boolean isShouldHandle() {
        return this.shouldHandle;
    }

    @AnyProcess
    public void setShareVideoFailReason(String str) {
        this.mShareVideoFailReason = str;
    }

    @AnyProcess
    public void setShareVideoResult(boolean z) {
        this.mShareVideoResult = z;
    }

    @AnyProcess
    public void setShouldHandle(boolean z) {
        this.shouldHandle = z;
    }
}
