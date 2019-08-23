package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56856a;

    /* renamed from: b  reason: collision with root package name */
    private final p f56857b;

    l(p pVar) {
        this.f56857b = pVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f56856a, false, 60900, new Class[0], Object.class)) {
            return j.a((Context) this.f56857b.f56867b, this.f56857b.p);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f56856a, false, 60900, new Class[0], Object.class);
    }
}
