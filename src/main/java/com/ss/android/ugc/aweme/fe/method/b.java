package com.ss.android.ugc.aweme.fe.method;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44531a;

    /* renamed from: b  reason: collision with root package name */
    private final a f44532b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f44533c;

    b(a aVar, CountDownLatch countDownLatch) {
        this.f44532b = aVar;
        this.f44533c = countDownLatch;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f44531a, false, 39735, new Class[0], Object.class)) {
            return this.f44532b.a(this.f44533c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f44531a, false, 39735, new Class[0], Object.class);
    }
}
