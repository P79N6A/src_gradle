package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bu implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10458a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10459b;

    bu(bl blVar) {
        this.f10459b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10458a, false, 4736, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10458a, false, 4736, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10459b.a((Throwable) obj);
    }
}
