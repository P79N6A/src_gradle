package com.bytedance.ttnet.hostmonitor;

public enum a {
    NONE(0),
    WIFI(1),
    MOBILE(2);
    
    int value;

    /* access modifiers changed from: package-private */
    public final int getValue() {
        return this.value;
    }

    private a(int i) {
        this.value = i;
    }
}
