package com.bytedance.android.live.core.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7834a;

    public static void a(String str, Throwable th) {
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str2, th2}, null, f7834a, true, 272, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, th2}, null, f7834a, true, 272, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(6, str2, null, th2);
    }

    public static void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f7834a, true, 270, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f7834a, true, 270, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4);
    }

    public static void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f7834a, true, 268, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f7834a, true, 268, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(4, str3, str4);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f7834a, true, 267, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f7834a, true, 267, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(3, str3, str4);
    }

    public static void a(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, null, f7834a, true, 264, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, null, f7834a, true, 264, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 2:
                com.ss.b.a.a.a(str, str2);
                return;
            case 3:
                com.ss.b.a.a.b(str, str2);
                return;
            case 4:
                com.ss.b.a.a.c(str, str2);
                return;
            case 5:
                com.ss.b.a.a.d(str, str2);
                return;
            case 6:
                com.ss.b.a.a.e(str, str2);
                break;
        }
    }

    public static void b(int i, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2}, null, f7834a, true, 277, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2}, null, f7834a, true, 277, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.b.a.a.a(i, str, str2);
    }

    public static void a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, stackTraceElementArr}, null, f7834a, true, 281, new Class[]{Integer.TYPE, String.class, StackTraceElement[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, stackTraceElementArr}, null, f7834a, true, 281, new Class[]{Integer.TYPE, String.class, StackTraceElement[].class}, Void.TYPE);
            return;
        }
        com.ss.b.a.a.a(i, str, stackTraceElementArr);
    }

    public static void a(String str, String str2, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{str3, str4, th2}, null, f7834a, true, 274, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, th2}, null, f7834a, true, 274, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(6, str3, str4, th2);
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, str2, th}, null, f7834a, true, 275, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, str2, th}, null, f7834a, true, 275, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        b(i, str, str2, th);
    }

    private static void b(int i, String str, String str2, Throwable th) {
        String str3 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str2, th2}, null, f7834a, true, 265, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str2, th2}, null, f7834a, true, 265, new Class[]{Integer.TYPE, String.class, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        switch (i) {
            case 5:
                if (isEmpty) {
                    com.ss.b.a.a.a(str3, th2);
                    return;
                } else {
                    com.ss.b.a.a.a(str, str2, th);
                    return;
                }
            case 6:
                if (!isEmpty) {
                    com.ss.b.a.a.b(str, str2, th);
                    break;
                } else {
                    com.ss.b.a.a.b(str3, th2);
                    return;
                }
        }
    }
}
