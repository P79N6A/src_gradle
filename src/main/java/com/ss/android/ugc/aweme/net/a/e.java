package com.ss.android.ugc.aweme.net.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56841a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56842b;

    e(long j) {
        this.f56842b = j;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f56841a, false, 60865, new Class[0], Object.class)) {
            return d.a(this.f56842b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f56841a, false, 60865, new Class[0], Object.class);
    }
}
