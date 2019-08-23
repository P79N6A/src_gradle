package com.ss.android.ugc.aweme.utils;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public final class cn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75692a;

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap<String, Long> f75693b = new ConcurrentHashMap<>();

    @SuppressLint({"LogNotTimber"})
    public static long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75692a, true, 88396, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f75692a, true, 88396, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        try {
            return System.currentTimeMillis() - f75693b.get(str2).longValue();
        } catch (NullPointerException unused) {
            return 0;
        }
    }
}
