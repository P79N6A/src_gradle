package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.presenter.x;
import com.bytedance.android.livesdk.gift.relay.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11420a;

    /* renamed from: b  reason: collision with root package name */
    private final x f11421b;

    public y(x xVar) {
        this.f11421b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11420a, false, 5212, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11420a, false, 5212, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        x xVar = this.f11421b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            ((x.a) xVar.b()).a(((b) dVar.f7871b).f15435a);
        }
    }
}
