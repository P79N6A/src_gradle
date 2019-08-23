package com.ss.android.ugc.aweme.qrcode.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63547a;

    /* renamed from: b  reason: collision with root package name */
    private final h f63548b;

    i(h hVar) {
        this.f63548b = hVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f63547a, false, 70609, new Class[0], Object.class)) {
            return this.f63548b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f63547a, false, 70609, new Class[0], Object.class);
    }
}
