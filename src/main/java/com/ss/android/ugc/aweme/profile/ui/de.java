package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class de implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62633a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62634b;

    de(ProfileMoreFragment profileMoreFragment) {
        this.f62634b = profileMoreFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62633a, false, 68872, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62633a, false, 68872, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62634b.a();
    }
}
