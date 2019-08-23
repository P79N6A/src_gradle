package com.ss.android.ugc.aweme.framework.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3298a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f3299b;

    /* renamed from: c  reason: collision with root package name */
    public static CopyOnWriteArrayList<b> f3300c;
    @SuppressLint({"CI_StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static Context f3301d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3302e;

    public static void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f3298a, true, 45877, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, null, f3298a, true, 45877, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (f3299b && f3300c != null) {
            Iterator<b> it2 = f3300c.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next != null && next.a()) {
                    next.a(next.b(), th2);
                }
            }
        }
    }

    public static void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f3298a, true, 45874, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, null, f3298a, true, 45874, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a("", exc2);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f3298a, true, 45878, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f3298a, true, 45878, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(3, null, str2);
    }

    public static synchronized void a(Context context, List<b> list) {
        List<b> list2 = list;
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[]{context, list2}, null, f3298a, true, 45873, new Class[]{Context.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, list2}, null, f3298a, true, 45873, new Class[]{Context.class, List.class}, Void.TYPE);
            } else if (f3299b) {
                throw new IllegalStateException("CrashlyticsWrapper already inited!");
            } else if (context != null) {
                f3302e = true;
                f3301d = context.getApplicationContext();
                if (!list.isEmpty()) {
                    f3300c = new CopyOnWriteArrayList<>(list2);
                }
                if (f3300c != null) {
                    Iterator<b> it2 = f3300c.iterator();
                    while (it2.hasNext()) {
                        b next = it2.next();
                        if (next != null && next.a()) {
                            next.a(f3301d);
                        }
                    }
                }
                f3299b = true;
            } else {
                throw new IllegalArgumentException("Context can't be null!");
            }
        }
    }

    public static void a(String str, Exception exc) {
        String str2 = str;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{str2, exc2}, null, f3298a, true, 45875, new Class[]{String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, exc2}, null, f3298a, true, 45875, new Class[]{String.class, Exception.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
            if (f3299b && f3300c != null) {
                Iterator<b> it2 = f3300c.iterator();
                while (it2.hasNext()) {
                    b next = it2.next();
                    if (next != null && next.a()) {
                        next.a(next.b(), str2, exc2);
                    }
                }
            }
        } else if (exc2 instanceof RuntimeException) {
            throw ((RuntimeException) exc2);
        } else {
            throw new RuntimeException(str2, exc2);
        }
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f3298a, true, 45880, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f3298a, true, 45880, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(2, str3, str4);
    }

    public static void a(String str, Map<String, String> map) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, null}, null, f3298a, true, 45876, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, null}, null, f3298a, true, 45876, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        if (f3299b && f3300c != null) {
            Iterator<b> it2 = f3300c.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next != null && next.a()) {
                    next.a(next.b(), str2, (Map<String, String>) null);
                }
            }
        }
    }

    public static void a(int i, String str, String str2) {
        String str3;
        int i2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str4}, null, f3298a, true, 45879, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str4}, null, f3298a, true, 45879, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (f3299b && f3300c != null) {
            Iterator<b> it2 = f3300c.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                if (next == null || !next.a()) {
                    int i3 = i;
                } else {
                    if (str == null) {
                        str3 = next.b();
                        i2 = i;
                    } else {
                        i2 = i;
                        str3 = str;
                    }
                    next.a(i2, str3, str4);
                }
            }
        }
    }
}
