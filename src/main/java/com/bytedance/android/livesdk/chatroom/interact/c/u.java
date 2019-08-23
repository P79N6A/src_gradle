package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10814a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10815b;

    u(n nVar) {
        this.f10815b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10814a, false, 4653, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10814a, false, 4653, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10815b.c((Throwable) obj);
    }
}
