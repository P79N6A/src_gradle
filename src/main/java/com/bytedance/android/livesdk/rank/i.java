package com.bytedance.android.livesdk.rank;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17004a;

    /* renamed from: b  reason: collision with root package name */
    public static int f17005b;

    /* renamed from: c  reason: collision with root package name */
    public static long f17006c;

    /* renamed from: d  reason: collision with root package name */
    public static int f17007d;

    /* renamed from: e  reason: collision with root package name */
    public static long f17008e;

    /* renamed from: f  reason: collision with root package name */
    public static int f17009f;
    public static long g;
    public static long h;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f17004a, true, 12980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f17004a, true, 12980, new Class[0], Void.TYPE);
        } else {
            h = SystemClock.uptimeMillis();
        }
    }

    public static String a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, f17004a, true, 12972, new Class[]{String.class}, String.class)) {
            return d.a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f17004a, true, 12972, new Class[]{String.class}, String.class);
    }

    public static void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f17004a, true, 12978, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f17004a, true, 12978, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f17007d = i;
        f17008e = SystemClock.uptimeMillis();
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f17004a, true, 12974, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f17004a, true, 12974, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f17005b = i;
        f17006c = SystemClock.uptimeMillis();
    }
}
