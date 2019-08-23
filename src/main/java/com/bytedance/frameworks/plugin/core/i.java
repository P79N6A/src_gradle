package com.bytedance.frameworks.plugin.core;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static volatile i f2208b;

    /* renamed from: a  reason: collision with root package name */
    public ClassLoader f2209a;

    private i() {
    }

    public static i a() {
        if (f2208b == null) {
            synchronized (i.class) {
                if (f2208b == null) {
                    f2208b = new i();
                }
            }
        }
        return f2208b;
    }
}
