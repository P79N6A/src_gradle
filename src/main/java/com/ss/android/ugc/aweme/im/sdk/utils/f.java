package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52583a;

    /* renamed from: b  reason: collision with root package name */
    private static long f52584b;

    public static synchronized long a() {
        synchronized (f.class) {
            if (PatchProxy.isSupport(new Object[0], null, f52583a, true, 53364, new Class[0], Long.TYPE)) {
                long longValue = ((Long) PatchProxy.accessDispatch(new Object[0], null, f52583a, true, 53364, new Class[0], Long.TYPE)).longValue();
                return longValue;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= f52584b) {
                currentTimeMillis = f52584b + 1;
            }
            f52584b = currentTimeMillis;
            return currentTimeMillis;
        }
    }
}
