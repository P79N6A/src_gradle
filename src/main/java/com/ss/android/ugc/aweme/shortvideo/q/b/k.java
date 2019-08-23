package com.ss.android.ugc.aweme.shortvideo.q.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68991a;

    /* renamed from: b  reason: collision with root package name */
    private final j f68992b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f68993c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f68994d;

    k(j jVar, boolean z, boolean z2) {
        this.f68992b = jVar;
        this.f68993c = z;
        this.f68994d = z2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f68991a, false, 81169, new Class[0], Object.class)) {
            return this.f68992b.a(this.f68993c, this.f68994d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f68991a, false, 81169, new Class[0], Object.class);
    }
}
