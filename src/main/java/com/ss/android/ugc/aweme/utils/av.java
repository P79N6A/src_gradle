package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import java.util.TimeZone;

public final class av {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75544a;

    public static int a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75544a, true, 88153, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return u.b(b(j));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75544a, true, 88153, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
    }

    private static long b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75544a, true, 88152, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75544a, true, 88152, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        }
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f75544a, true, 88151, new Class[]{Long.TYPE}, Long.TYPE)) {
            return j2 + ((long) TimeZone.getDefault().getRawOffset());
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f75544a, true, 88151, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }
}
