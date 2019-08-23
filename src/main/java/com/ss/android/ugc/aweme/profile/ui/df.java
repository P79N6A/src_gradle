package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class df implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62635a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62636b;

    df(ProfileMoreFragment profileMoreFragment) {
        this.f62636b = profileMoreFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62635a, false, 68873, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62635a, false, 68873, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ProfileMoreFragment profileMoreFragment = this.f62636b;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            com.ss.android.ugc.aweme.app.api.a.a.a((Context) profileMoreFragment.getActivity(), (a) th);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
