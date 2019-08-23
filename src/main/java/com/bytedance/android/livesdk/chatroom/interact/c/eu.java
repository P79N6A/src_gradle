package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eu implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10650a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10651b;

    eu(es esVar) {
        this.f10651b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10650a, false, 4913, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10650a, false, 4913, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10651b;
        esVar.f10639b = false;
        ((es.b) esVar.b()).a(((c) obj).f7867b);
    }
}
