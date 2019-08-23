package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52461a;

    public static int a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f52461a, true, 53649, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f52461a, true, 53649, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        int i = (int) j2;
        if (((long) i) == j2) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }
}
