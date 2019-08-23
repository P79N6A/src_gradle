package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12115a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12116b;

    dw(dl dlVar) {
        this.f12116b = dlVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12115a, false, 6241, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12115a, false, 6241, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        dl dlVar = this.f12116b;
        d dVar = (d) obj;
        dlVar.c();
        if (((u) dVar.f7871b).f11169b) {
            dlVar.a(true);
        } else if (((u) dVar.f7871b).f11168a) {
            dlVar.b();
        } else {
            dlVar.a(false);
        }
    }
}
