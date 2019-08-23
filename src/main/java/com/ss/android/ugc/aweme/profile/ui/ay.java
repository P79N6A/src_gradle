package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ay implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62496a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62497b;

    ay(MusUserProfileFragment musUserProfileFragment) {
        this.f62497b = musUserProfileFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62496a, false, 68442, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62496a, false, 68442, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        MusUserProfileFragment musUserProfileFragment = this.f62497b;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            com.ss.android.ugc.aweme.app.api.a.a.a(musUserProfileFragment.getContext(), (a) th);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
