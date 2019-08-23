package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62476a;

    /* renamed from: b  reason: collision with root package name */
    private final MusMyProfileFragment f62477b;

    ap(MusMyProfileFragment musMyProfileFragment) {
        this.f62477b = musMyProfileFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62476a, false, 68324, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62476a, false, 68324, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62477b.a((Boolean) obj);
    }
}
