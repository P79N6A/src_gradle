package com.ss.android.ugc.aweme.miniapp.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55440a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55441b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55442c;

    public h(long j, String str) {
        this.f55441b = j;
        this.f55442c = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f55440a, false, 59152, new Class[0], Object.class)) {
            return g.a(this.f55441b, this.f55442c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f55440a, false, 59152, new Class[0], Object.class);
    }
}
