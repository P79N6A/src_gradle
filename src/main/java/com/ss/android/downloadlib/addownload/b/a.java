package com.ss.android.downloadlib.addownload.b;

public final class a extends Exception {
    private final int mExtStatus;
    private final int mFinalStatus;
    private final String mOpenAppPackageName;

    public final int getExtStatus() {
        return this.mExtStatus;
    }

    public final int getFinalStatus() {
        return this.mFinalStatus;
    }

    public final String getOpenAppPackageName() {
        return this.mOpenAppPackageName;
    }

    public a(int i) {
        this(i, 0);
    }

    public a(int i, int i2) {
        this(i, i2, null);
    }

    public a(int i, int i2, String str) {
        this.mFinalStatus = i;
        this.mExtStatus = i2;
        this.mOpenAppPackageName = str;
    }
}
