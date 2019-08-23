package com.bytedance.android.livesdk.wallet;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ah implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17939a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f17940b;

    ah(ae aeVar) {
        this.f17940b = aeVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17939a, false, 14127, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17939a, false, 14127, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17940b.b((Throwable) obj);
    }
}
