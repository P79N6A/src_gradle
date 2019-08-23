package com.bytedance.android.livesdk.feed.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14350a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f14351b = new j();

    private j() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14350a, false, 8856, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14350a, false, 8856, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
