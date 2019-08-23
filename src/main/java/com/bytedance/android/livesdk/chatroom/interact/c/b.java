package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10409a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10410b;

    b(a aVar) {
        this.f10410b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10409a, false, 4625, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10409a, false, 4625, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10410b;
        aVar.f10352d = false;
        if (aVar.b() != null) {
            ((a.C0086a) aVar.b()).b();
        }
    }
}
