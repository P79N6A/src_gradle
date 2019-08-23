package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10802a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10803b;

    p(n nVar) {
        this.f10803b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10802a, false, 4648, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10802a, false, 4648, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10803b.a((Long) obj);
    }
}
