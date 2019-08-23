package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class br implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11313a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioViewPresenter f11314b;

    br(RadioViewPresenter radioViewPresenter) {
        this.f11314b = radioViewPresenter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11313a, false, 5309, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11313a, false, 5309, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RadioViewPresenter radioViewPresenter = this.f11314b;
        d dVar = (d) obj;
        if (radioViewPresenter.b() != null) {
            if (dVar.f7870a == 0) {
                ((RadioViewPresenter.a) radioViewPresenter.b()).e();
                return;
            }
            ((RadioViewPresenter.a) radioViewPresenter.b()).f();
        }
    }
}
