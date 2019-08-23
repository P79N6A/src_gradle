package org.android.spdy;

public enum SslVersion {
    SLIGHT_VERSION_V1(0);
    
    private int code;

    /* access modifiers changed from: package-private */
    public final int getint() {
        return this.code;
    }

    private SslVersion(int i) {
        this.code = i;
    }
}
