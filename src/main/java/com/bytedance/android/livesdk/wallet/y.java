package com.bytedance.android.livesdk.wallet;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18167a;

    /* renamed from: b  reason: collision with root package name */
    private final v f18168b;

    y(v vVar) {
        this.f18168b = vVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18167a, false, 14003, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18167a, false, 14003, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f18168b.a((Throwable) obj);
    }
}
