package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10418a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10419b;

    bd(ay ayVar) {
        this.f10419b = ayVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10418a, false, 4704, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10418a, false, 4704, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10419b.a((d) obj);
    }
}
