package com.ss.android.ugc.effectmanager.common.c;

public final class b extends Exception {
    private int mStatusCode;

    public final int getStatusCode() {
        return this.mStatusCode;
    }

    public final void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public b(int i, String str) {
        super(str);
        this.mStatusCode = i;
    }
}
