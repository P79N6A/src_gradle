package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ak implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9563a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9564b;

    ak(af afVar) {
        this.f9564b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9563a, false, 3742, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9563a, false, 3742, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9564b.a((Throwable) obj);
    }
}
