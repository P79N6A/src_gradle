package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10596a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10597b;

    e(a aVar) {
        this.f10597b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10596a, false, 4628, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10596a, false, 4628, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10597b;
        Throwable th = (Throwable) obj;
        aVar.a(th);
        aVar.f10353e = false;
        if (aVar.b() != null) {
            ((a.C0086a) aVar.b()).c(th);
        }
    }
}
