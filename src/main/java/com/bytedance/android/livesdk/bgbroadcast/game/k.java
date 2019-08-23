package com.bytedance.android.livesdk.bgbroadcast.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9238a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9239b = new k();

    private k() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9238a, false, 3318, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9238a, false, 3318, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
