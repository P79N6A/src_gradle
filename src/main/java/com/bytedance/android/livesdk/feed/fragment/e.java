package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14142a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseTabFeedFragment f14143b;

    e(BaseTabFeedFragment baseTabFeedFragment) {
        this.f14143b = baseTabFeedFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14142a, false, 8639, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14142a, false, 8639, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseTabFeedFragment baseTabFeedFragment = this.f14143b;
        ((Integer) obj).intValue();
    }
}
