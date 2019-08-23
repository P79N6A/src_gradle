package org.android.spdy;

public enum SslMod {
    SLIGHT_SLL_NOT_ENCRYT(0),
    SLIGHT_SSL_0_RTT(1);
    
    private int code;

    /* access modifiers changed from: package-private */
    public final int getint() {
        return this.code;
    }

    private SslMod(int i) {
        this.code = i;
    }
}
