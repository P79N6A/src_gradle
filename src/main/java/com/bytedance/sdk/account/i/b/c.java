package com.bytedance.sdk.account.i.b;

import com.bytedance.sdk.account.i.a.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, a> f22436a = new ConcurrentHashMap();

    public static <T extends a> T a(Class<T> cls) {
        return (a) f22436a.get(cls);
    }
}
