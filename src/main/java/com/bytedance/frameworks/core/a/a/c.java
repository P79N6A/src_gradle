package com.bytedance.frameworks.core.a.a;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f19881a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f19882b;

    static {
        ConcurrentHashMap<String, b> concurrentHashMap = new ConcurrentHashMap<>();
        f19882b = concurrentHashMap;
        concurrentHashMap.put("default", f19881a);
    }

    public static List<String> a(String str) {
        if (TextUtils.isEmpty(str) || f19882b.get(str) == null) {
            return f19881a.d();
        }
        return f19882b.get(str).d();
    }

    public static void a(String str, b bVar) {
        f19882b.put(str, bVar);
    }

    public static List<String> a(String str, String str2) {
        if (TextUtils.isEmpty(str) || f19882b.get(str) == null) {
            return f19881a.b(str2);
        }
        return f19882b.get(str).b(str2);
    }
}
