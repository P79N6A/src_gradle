package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bh implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62520a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62521b;

    bh(MyProfileFragment myProfileFragment) {
        this.f62521b = myProfileFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62520a, false, 68562, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62520a, false, 68562, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62521b.a((Boolean) obj);
    }
}
