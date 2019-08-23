package com.bytedance.android.livesdk.bgbroadcast;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9243a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9244b = new i();

    private i() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9243a, false, 3258, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9243a, false, 3258, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
