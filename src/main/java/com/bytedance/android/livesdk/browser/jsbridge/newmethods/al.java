package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class al implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9565a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9566b;

    al(af afVar) {
        this.f9566b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9565a, false, 3743, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9565a, false, 3743, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9566b.c();
    }
}
