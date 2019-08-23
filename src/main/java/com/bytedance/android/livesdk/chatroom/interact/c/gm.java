package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.gc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10754a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10755b;

    gm(gc gcVar) {
        this.f10755b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10754a, false, 4996, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10754a, false, 4996, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10755b;
        Long l = (Long) obj;
        if (gcVar.b() != null) {
            if (l.longValue() <= 0) {
                gcVar.f10735e.dispose();
                gcVar.f10735e = null;
                return;
            }
            ((gc.a) gcVar.b()).a(l.intValue() * 50, 5000);
        }
    }
}
