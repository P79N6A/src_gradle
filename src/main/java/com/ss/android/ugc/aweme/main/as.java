package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class as implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54352a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54353b;

    as(MainPageFragment mainPageFragment) {
        this.f54353b = mainPageFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54352a, false, 57544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54352a, false, 57544, new Class[0], Void.TYPE);
            return;
        }
        this.f54353b.lambda$tryShowFissionPopupWindow$15$MainPageFragment();
    }
}
