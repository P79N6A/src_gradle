package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class as {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52493a;

    /* renamed from: b  reason: collision with root package name */
    private static long f52494b;

    /* renamed from: c  reason: collision with root package name */
    private static long f52495c;

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Long> f52496d = new HashMap(10);

    public static void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52493a, true, 53697, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f52493a, true, 53697, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f52495c = currentTimeMillis;
        f52494b = currentTimeMillis;
    }

    public static Long c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f52493a, true, 53698, new Class[]{String.class}, Long.class)) {
            return f52496d.get(str2);
        }
        return (Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f52493a, true, 53698, new Class[]{String.class}, Long.class);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52493a, true, 53696, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52493a, true, 53696, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f52494b = System.currentTimeMillis();
        f52496d.put(str2, Long.valueOf(f52494b));
    }
}
