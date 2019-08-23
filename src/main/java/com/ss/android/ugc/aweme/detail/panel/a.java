package com.ss.android.ugc.aweme.detail.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41330a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailFragmentPanel f41331b;

    a(DetailFragmentPanel detailFragmentPanel) {
        this.f41331b = detailFragmentPanel;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f41330a, false, 34967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41330a, false, 34967, new Class[0], Void.TYPE);
            return;
        }
        this.f41331b.C();
    }
}
