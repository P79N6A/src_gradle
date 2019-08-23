package com.bytedance.frameworks.core.a.c;

import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f19940a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f19941b = new ConcurrentHashMap<>();

    public static c a(String str) {
        return f19941b.get(str);
    }

    public static void a(String str, c cVar) {
        f19941b.put(str, cVar);
    }
}
