package com.bytedance.android.livesdk.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14501a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f14502b = new n();

    private n() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14501a, false, 9017, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14501a, false, 9017, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
