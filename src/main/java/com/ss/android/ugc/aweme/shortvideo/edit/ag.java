package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ag implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66961a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66962b;

    ag(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66962b = vEVideoPublishEditActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66961a, false, 76457, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66961a, false, 76457, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66962b.a((Boolean) obj);
    }
}
