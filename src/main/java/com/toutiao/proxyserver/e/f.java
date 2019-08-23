package com.toutiao.proxyserver.e;

import android.net.TrafficStats;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80067a;

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f80067a, false, 91858, new Class[0], Long.TYPE)) {
            return TrafficStats.getTotalRxBytes();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f80067a, false, 91858, new Class[0], Long.TYPE)).longValue();
    }
}
