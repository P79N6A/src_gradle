package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bs implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11315a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioViewPresenter f11316b;

    bs(RadioViewPresenter radioViewPresenter) {
        this.f11316b = radioViewPresenter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11315a, false, 5310, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11315a, false, 5310, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RadioViewPresenter radioViewPresenter = this.f11316b;
        if (radioViewPresenter.b() != null) {
            ((RadioViewPresenter.a) radioViewPresenter.b()).f();
        }
    }
}
