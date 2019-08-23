package com.umeng.analytics.pro;

public enum bj implements ck {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);
    

    /* renamed from: d  reason: collision with root package name */
    private final int f80453d;

    public final int a() {
        return this.f80453d;
    }

    public static bj a(int i) {
        switch (i) {
            case 0:
                return MALE;
            case 1:
                return FEMALE;
            case 2:
                return UNKNOWN;
            default:
                return null;
        }
    }

    private bj(int i) {
        this.f80453d = i;
    }
}
