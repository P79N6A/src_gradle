package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10816a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10817b;

    v(n nVar) {
        this.f10817b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10816a, false, 4654, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10816a, false, 4654, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10817b.a((d) obj);
    }
}
