package com.bytedance.android.livesdk.chatroom.interact.d;

import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10843a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10844b;

    c(a aVar) {
        this.f10844b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10843a, false, 5047, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10843a, false, 5047, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10844b;
        com.bytedance.android.live.core.network.response.c cVar = (com.bytedance.android.live.core.network.response.c) obj;
        aVar.f10838d = false;
        for (a.C0089a c2 : aVar.g) {
            c2.c(cVar.f7867b);
        }
    }
}
