package com.facebook.react.bridge;

import javax.annotation.concurrent.GuardedBy;

public class JavaScriptContextHolder {
    @GuardedBy
    private long mContext;

    @GuardedBy
    public long get() {
        return this.mContext;
    }

    public synchronized void clear() {
        this.mContext = 0;
    }

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }
}
