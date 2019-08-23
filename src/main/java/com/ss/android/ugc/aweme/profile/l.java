package com.ss.android.ugc.aweme.profile;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61552a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfilePageFragment f61553b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f61554c;

    l(ProfilePageFragment profilePageFragment, boolean z) {
        this.f61553b = profilePageFragment;
        this.f61554c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61552a, false, 67267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61552a, false, 67267, new Class[0], Void.TYPE);
            return;
        }
        this.f61553b.a(this.f61554c);
    }
}
