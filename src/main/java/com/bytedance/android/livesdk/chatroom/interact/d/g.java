package com.bytedance.android.livesdk.chatroom.interact.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10851a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10852b;

    g(a aVar) {
        this.f10852b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10851a, false, 5051, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10851a, false, 5051, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10852b;
        aVar.a((Throwable) obj);
        aVar.f10836b = false;
    }
}
