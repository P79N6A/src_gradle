package com.bytedance.android.livesdk.wallet;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18144a;

    /* renamed from: b  reason: collision with root package name */
    private final p f18145b;

    s(p pVar) {
        this.f18145b = pVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18144a, false, 13980, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18144a, false, 13980, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f18145b.a((Throwable) obj);
    }
}
