package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ey implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10658a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10659b;

    ey(es esVar) {
        this.f10659b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10658a, false, 4917, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10658a, false, 4917, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10659b;
        esVar.f10642e = false;
        j.q().n().e();
        ((es.b) esVar.b()).c();
    }
}
