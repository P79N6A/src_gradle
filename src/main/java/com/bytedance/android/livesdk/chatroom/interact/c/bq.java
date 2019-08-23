package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10450a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10451b;

    public bq(bl blVar) {
        this.f10451b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10450a, false, 4732, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10450a, false, 4732, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10451b;
        Throwable th = (Throwable) obj;
        blVar.b(th);
        ((bl.a) blVar.b()).c(th);
    }
}
