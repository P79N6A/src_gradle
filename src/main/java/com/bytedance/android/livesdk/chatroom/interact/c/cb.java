package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10475a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10476b;

    cb(bl blVar) {
        this.f10476b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10475a, false, 4743, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10475a, false, 4743, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10476b;
        Throwable th = (Throwable) obj;
        blVar.f10439e = false;
        blVar.b(th);
        ((bl.a) blVar.b()).b(th);
        blVar.f10437c = -1;
    }
}
