package com.ss.android.ugc.aweme.miniapp.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55841a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55842b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55843c;

    j(long j, long j2) {
        this.f55842b = j;
        this.f55843c = j2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55841a, false, 59555, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55841a, false, 59555, new Class[0], Object.class);
        }
        MicroAppApi.a(this.f55842b, this.f55843c);
        return null;
    }
}
