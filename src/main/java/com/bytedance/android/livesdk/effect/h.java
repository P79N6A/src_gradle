package com.bytedance.android.livesdk.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13779a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13780b = new h();

    private h() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13779a, false, 8173, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13779a, false, 8173, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
