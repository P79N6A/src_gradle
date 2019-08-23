package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10762a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10763b;

    gq(gc gcVar) {
        this.f10763b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10762a, false, 5000, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10762a, false, 5000, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10763b.a((Throwable) obj);
    }
}
