package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ai implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9559a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9560b;

    ai(af afVar) {
        this.f9560b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9559a, false, 3740, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9559a, false, 3740, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9560b.a((Throwable) obj);
    }
}
