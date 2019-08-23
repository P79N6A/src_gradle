package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62532a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62533b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62534c;

    bm(MyProfileFragment myProfileFragment, boolean z) {
        this.f62533b = myProfileFragment;
        this.f62534c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62532a, false, 68567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62532a, false, 68567, new Class[0], Void.TYPE);
            return;
        }
        this.f62533b.h(this.f62534c);
    }
}
