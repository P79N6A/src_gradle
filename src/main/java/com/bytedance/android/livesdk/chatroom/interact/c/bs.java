package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bs implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10454a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10455b;

    bs(bl blVar) {
        this.f10455b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10454a, false, 4734, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10454a, false, 4734, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10455b;
        Throwable th = (Throwable) obj;
        blVar.b(th);
        ((bl.a) blVar.b()).d(th);
    }
}
