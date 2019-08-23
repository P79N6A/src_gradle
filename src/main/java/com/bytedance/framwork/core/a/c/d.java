package com.bytedance.framwork.core.a.c;

import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, c> f20109a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f20110b = new ConcurrentHashMap<>();

    public static c a(String str) {
        return f20109a.get(str);
    }
}
