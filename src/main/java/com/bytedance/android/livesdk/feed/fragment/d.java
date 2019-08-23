package com.bytedance.android.livesdk.feed.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14140a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f14141b = new d();

    private d() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14140a, false, 8638, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14140a, false, 8638, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
