package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10462a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10463b;

    bw(bl blVar) {
        this.f10463b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10462a, false, 4738, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10462a, false, 4738, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((bl.a) this.f10463b.b()).a(false);
    }
}
