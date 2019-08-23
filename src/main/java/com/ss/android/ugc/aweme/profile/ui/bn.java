package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62535a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62536b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62537c;

    bn(MyProfileFragment myProfileFragment, boolean z) {
        this.f62536b = myProfileFragment;
        this.f62537c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62535a, false, 68568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62535a, false, 68568, new Class[0], Void.TYPE);
            return;
        }
        this.f62536b.i(this.f62537c);
    }
}
