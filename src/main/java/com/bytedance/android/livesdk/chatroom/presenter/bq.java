package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11311a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioViewPresenter f11312b;

    public bq(RadioViewPresenter radioViewPresenter) {
        this.f11312b = radioViewPresenter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11311a, false, 5308, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11311a, false, 5308, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(this.f11312b.f11192b, (Throwable) obj);
    }
}
