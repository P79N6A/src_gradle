package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public final class cu {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66138a;

    public static int a(int i, Throwable th) {
        int i2 = i;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), th2}, null, f66138a, true, 74233, new Class[]{Integer.TYPE, Throwable.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), th2}, null, f66138a, true, 74233, new Class[]{Integer.TYPE, Throwable.class}, Integer.TYPE)).intValue();
        } else if (!(th2 instanceof a) && !NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.port.in.a.f61119b)) {
            return i2 * 10000;
        } else {
            return i2;
        }
    }
}
