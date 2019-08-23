package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62718a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeListFragment f62719b;

    e(AwemeListFragment awemeListFragment) {
        this.f62719b = awemeListFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62718a, false, 67808, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62718a, false, 67808, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62719b.x();
    }
}
