package com.bytedance.article.common.monitor.b;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f19136a = new ConcurrentHashMap<>();

    public static c a(String str) throws IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            return f19136a.get(str);
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public static void a(String str, c cVar) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("type not be null or callback not be null");
        } else if (!f19136a.containsKey(str)) {
            f19136a.put(str, cVar);
        }
    }
}
