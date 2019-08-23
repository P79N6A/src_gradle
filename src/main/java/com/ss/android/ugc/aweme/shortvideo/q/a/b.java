package com.ss.android.ugc.aweme.shortvideo.q.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.t;
import com.ss.android.vesdk.VEUtils;

public final /* synthetic */ class b implements VEUtils.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68944a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68945b;

    b(a aVar) {
        this.f68945b = aVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68944a, false, 81110, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68944a, false, 81110, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a(new d(this.f68945b, i));
    }
}
