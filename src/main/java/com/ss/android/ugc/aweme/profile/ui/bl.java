package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62529a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62530b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62531c;

    bl(MyProfileFragment myProfileFragment, boolean z) {
        this.f62530b = myProfileFragment;
        this.f62531c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62529a, false, 68566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62529a, false, 68566, new Class[0], Void.TYPE);
            return;
        }
        this.f62530b.g(this.f62531c);
    }
}
