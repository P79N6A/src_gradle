package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class cm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75691a;

    public static <K, V> Map<K, V> a() {
        if (PatchProxy.isSupport(new Object[0], null, f75691a, true, 88384, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, f75691a, true, 88384, new Class[0], Map.class);
        }
        return b();
    }

    private static <K, V> HashMap<K, V> b() {
        if (PatchProxy.isSupport(new Object[0], null, f75691a, true, 88383, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], null, f75691a, true, 88383, new Class[0], HashMap.class);
        }
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        K k2 = k;
        V v2 = v;
        if (PatchProxy.isSupport(new Object[]{k2, v2}, null, f75691a, true, 88385, new Class[]{Object.class, Object.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{k2, v2}, null, f75691a, true, 88385, new Class[]{Object.class, Object.class}, Map.class);
        }
        Map<K, V> a2 = a();
        a2.put(k2, v2);
        return a2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        K k3 = k;
        V v3 = v;
        K k4 = k2;
        V v4 = v2;
        if (PatchProxy.isSupport(new Object[]{k3, v3, k4, v4}, null, f75691a, true, 88386, new Class[]{Object.class, Object.class, Object.class, Object.class}, Map.class)) {
            Object[] objArr = {k3, v3, k4, v4};
            return (Map) PatchProxy.accessDispatch(objArr, null, f75691a, true, 88386, new Class[]{Object.class, Object.class, Object.class, Object.class}, Map.class);
        }
        Map<K, V> a2 = a();
        a2.put(k3, v3);
        a2.put(k4, v4);
        return a2;
    }
}
