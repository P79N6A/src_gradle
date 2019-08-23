package com.ss.android.ugc.aweme.detail.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41376a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailPageFragment f41377b;

    h(DetailPageFragment detailPageFragment) {
        this.f41377b = detailPageFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f41376a, false, 35161, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f41376a, false, 35161, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f41377b.l();
    }
}
