package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gf implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10740a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10741b;

    gf(gc gcVar) {
        this.f10741b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10740a, false, 4989, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10740a, false, 4989, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10741b;
        gcVar.b((Throwable) obj);
        gcVar.c();
    }
}
