package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cg implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62577a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62578b;

    cg(ProfileEditFragment profileEditFragment) {
        this.f62578b = profileEditFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62577a, false, 68735, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62577a, false, 68735, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62578b.schoolInput.setRightText((String) obj);
    }
}
