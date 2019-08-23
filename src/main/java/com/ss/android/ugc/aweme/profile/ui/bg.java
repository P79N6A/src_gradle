package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62518a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62519b;

    bg(MusUserProfileFragment musUserProfileFragment) {
        this.f62519b = musUserProfileFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62518a, false, 68451, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62518a, false, 68451, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62519b.O();
    }
}
