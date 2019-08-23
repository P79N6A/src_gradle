package com.bytedance.ies.g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f20697b;

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f20698a = new ConcurrentHashMap();

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f20697b == null) {
                f20697b = new c();
            }
            cVar = f20697b;
        }
        return cVar;
    }
}
