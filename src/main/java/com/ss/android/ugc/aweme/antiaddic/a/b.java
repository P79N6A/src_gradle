package com.ss.android.ugc.aweme.antiaddic.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33367a;

    /* renamed from: b  reason: collision with root package name */
    public long f33368b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    public int f33369c;

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f33367a, false, 21721, new Class[0], Long.TYPE)) {
            return c.a().c();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f33367a, false, 21721, new Class[0], Long.TYPE)).longValue();
    }
}
