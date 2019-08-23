package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10756a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10757b;

    gn(gc gcVar) {
        this.f10757b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10756a, false, 4997, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10756a, false, 4997, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10757b.a((Throwable) obj);
    }
}
