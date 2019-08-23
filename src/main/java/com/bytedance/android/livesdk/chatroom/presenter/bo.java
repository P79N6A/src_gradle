package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bo implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11307a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioViewPresenter f11308b;

    bo(RadioViewPresenter radioViewPresenter) {
        this.f11308b = radioViewPresenter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11307a, false, 5306, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11307a, false, 5306, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11308b.a();
    }
}
