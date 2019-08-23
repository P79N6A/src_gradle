package com.bytedance.android.live.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8240a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f8241b = new SimpleDateFormat("yyyy-MM-dd");

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f8240a, true, 1304, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f8240a, true, 1304, new Class[0], Long.TYPE)).longValue();
        }
        return System.nanoTime() / 1000000;
    }
}
