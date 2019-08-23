package com.bytedance.android.livesdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17614a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f17615b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static long f17616c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static long f17617d = 500;

    private static void a(int i) {
        if (f17615b != i) {
            f17615b = i;
            f17616c = 0;
        }
    }

    private static boolean a(long j) {
        long j2 = j;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17614a, true, 13647, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17614a, true, 13647, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f17616c >= j2) {
            z = false;
        }
        if (!z) {
            f17616c = currentTimeMillis;
        }
        return z;
    }

    public static boolean a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f17614a, true, 13646, new Class[]{Integer.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f17614a, true, 13646, new Class[]{Integer.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a(i);
        return a(j);
    }
}
