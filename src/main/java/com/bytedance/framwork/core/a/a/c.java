package com.bytedance.framwork.core.a.a;

import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f20078a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f20079b;

    static {
        ConcurrentHashMap<String, b> concurrentHashMap = new ConcurrentHashMap<>();
        f20079b = concurrentHashMap;
        concurrentHashMap.put("default", f20078a);
    }
}
