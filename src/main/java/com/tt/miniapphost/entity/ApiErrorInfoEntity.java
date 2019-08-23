package com.tt.miniapphost.entity;

public class ApiErrorInfoEntity {
    private StringBuilder mMsgBuilder = new StringBuilder();
    private Throwable mThrowable;

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public String getErrorMsg() {
        return this.mMsgBuilder.toString();
    }

    public void setThrowable(Throwable th) {
        this.mThrowable = th;
    }

    public ApiErrorInfoEntity append(Object obj) {
        this.mMsgBuilder.append(obj);
        return this;
    }
}
