package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10494a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10495b;

    cj(bl blVar) {
        this.f10495b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10494a, false, 4751, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10494a, false, 4751, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10495b;
        Throwable th = (Throwable) obj;
        blVar.b(th);
        ((bl.a) blVar.b()).b(th);
        blVar.f10437c = -1;
        blVar.f10439e = false;
    }
}
