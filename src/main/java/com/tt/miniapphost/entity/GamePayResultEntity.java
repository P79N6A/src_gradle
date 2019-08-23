package com.tt.miniapphost.entity;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class GamePayResultEntity {
    private int mCode = -1;
    private String mMessage = "";
    private boolean mShouldHandle;

    @AnyProcess
    public int getCode() {
        return this.mCode;
    }

    @AnyProcess
    public String getMessage() {
        return this.mMessage;
    }

    @AnyProcess
    public boolean isShouldHandle() {
        return this.mShouldHandle;
    }

    @AnyProcess
    public void setCode(int i) {
        this.mCode = i;
    }

    @AnyProcess
    public void setMessage(String str) {
        this.mMessage = str;
    }

    @AnyProcess
    public void setShouldHandle(boolean z) {
        this.mShouldHandle = z;
    }
}
