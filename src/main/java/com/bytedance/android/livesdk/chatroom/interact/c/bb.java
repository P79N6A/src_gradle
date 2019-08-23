package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10413a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10414b;

    bb(ay ayVar) {
        this.f10414b = ayVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10413a, false, 4702, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10413a, false, 4702, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10414b.b((d) obj);
    }
}
