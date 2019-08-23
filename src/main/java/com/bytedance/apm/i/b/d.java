package com.bytedance.apm.i.b;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, b> f2008a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static c f2009b;

    public static c a() {
        return f2009b;
    }

    public static void a(String str, b bVar) {
        if (!TextUtils.isEmpty(str)) {
            f2008a.put(str, bVar);
        }
    }
}
