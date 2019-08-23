package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ar implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54350a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54351b;

    ar(MainPageFragment mainPageFragment) {
        this.f54351b = mainPageFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54350a, false, 57543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54350a, false, 57543, new Class[0], Void.TYPE);
            return;
        }
        this.f54351b.lambda$onSettingSyncDone$14$MainPageFragment();
    }
}
