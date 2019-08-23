package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56854a;

    /* renamed from: b  reason: collision with root package name */
    private final p f56855b;

    k(p pVar) {
        this.f56855b = pVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f56854a, false, 60899, new Class[0], Object.class)) {
            return j.a((Context) this.f56855b.f56867b, this.f56855b.p);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f56854a, false, 60899, new Class[0], Object.class);
    }
}
