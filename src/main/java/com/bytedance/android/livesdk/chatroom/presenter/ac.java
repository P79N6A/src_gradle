package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.presenter.ab;
import com.bytedance.android.livesdk.gift.relay.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ac implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11201a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f11202b;

    public ac(ab abVar) {
        this.f11202b = abVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11201a, false, 5218, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11201a, false, 5218, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ab abVar = this.f11202b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            ((ab.a) abVar.b()).a(((b) dVar.f7871b).f15435a);
        }
    }
}
