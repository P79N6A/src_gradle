package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10748a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10749b;

    gj(gc gcVar) {
        this.f10749b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10748a, false, 4993, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10748a, false, 4993, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10749b.a((Throwable) obj);
    }
}
