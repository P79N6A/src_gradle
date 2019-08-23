package org.android.spdy;

public enum SpdyVersion {
    SPDY2(2),
    SPDY3(3),
    SPDY3DOT1(4);
    
    private int version;

    /* access modifiers changed from: package-private */
    public final int getInt() {
        return this.version;
    }

    private SpdyVersion(int i) {
        this.version = i;
    }
}
