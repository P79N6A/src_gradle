package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10375a;

    /* renamed from: b  reason: collision with root package name */
    private final af f10376b;

    aj(af afVar) {
        this.f10376b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10375a, false, 4676, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10375a, false, 4676, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10376b.a((d) obj);
    }
}
