package com.bytedance.android.livesdk.feed.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14138a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseTabFeedFragment f14139b;

    c(BaseTabFeedFragment baseTabFeedFragment) {
        this.f14139b = baseTabFeedFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14138a, false, 8637, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14138a, false, 8637, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14139b.n();
    }
}
