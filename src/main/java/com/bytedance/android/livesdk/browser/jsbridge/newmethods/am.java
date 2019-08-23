package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class am implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9567a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9568b;

    am(af afVar) {
        this.f9568b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9567a, false, 3744, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9567a, false, 3744, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9568b.a((Throwable) obj);
    }
}
