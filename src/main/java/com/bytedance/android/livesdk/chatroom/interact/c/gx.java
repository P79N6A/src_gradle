package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gx implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10777a;

    /* renamed from: b  reason: collision with root package name */
    private final gs f10778b;

    gx(gs gsVar) {
        this.f10778b = gsVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10777a, false, 5012, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10777a, false, 5012, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10778b.b((Throwable) obj);
    }
}
