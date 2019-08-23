package com.bytedance.android.livesdk.gift.assets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14739a;

    /* renamed from: b  reason: collision with root package name */
    private final c f14740b;

    e(c cVar) {
        this.f14740b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14739a, false, 9344, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14739a, false, 9344, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f14740b;
        c.class.getSimpleName();
        ((Throwable) obj).getMessage();
        if (cVar.f14724e != null && !cVar.f14724e.isDisposed()) {
            cVar.f14724e.dispose();
            cVar.f14724e = null;
        }
    }
}
