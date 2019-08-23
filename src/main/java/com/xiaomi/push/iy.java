package com.xiaomi.push;

public enum iy {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: a  reason: collision with other field name */
    private final int f616a;

    private iy(int i) {
        this.f616a = i;
    }

    public static iy a(int i) {
        switch (i) {
            case 0:
                return RegIdExpired;
            case 1:
                return PackageUnregistered;
            case 2:
                return Init;
            default:
                return null;
        }
    }

    public final int a() {
        return this.f616a;
    }
}
