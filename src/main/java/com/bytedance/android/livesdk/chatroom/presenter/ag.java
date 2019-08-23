package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ag implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11213a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11214b;

    ag(af afVar) {
        this.f11214b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11213a, false, 5232, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11213a, false, 5232, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11214b;
        User user = (User) obj;
        if (afVar.b() != null) {
            ((af.b) afVar.b()).a((i) user);
        }
    }
}
