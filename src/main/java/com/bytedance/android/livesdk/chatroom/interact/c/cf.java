package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cf implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10484a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10485b;

    cf(bl blVar) {
        this.f10485b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10484a, false, 4747, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10484a, false, 4747, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10485b.a((Throwable) obj);
    }
}
