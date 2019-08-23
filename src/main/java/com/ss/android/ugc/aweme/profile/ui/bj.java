package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62524a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62525b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62526c;

    bj(MyProfileFragment myProfileFragment, boolean z) {
        this.f62525b = myProfileFragment;
        this.f62526c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62524a, false, 68564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62524a, false, 68564, new Class[0], Void.TYPE);
            return;
        }
        this.f62525b.f(this.f62526c);
    }
}
