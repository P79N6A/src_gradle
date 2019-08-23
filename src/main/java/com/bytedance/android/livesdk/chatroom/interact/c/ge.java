package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.gc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ge implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10738a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10739b;

    ge(gc gcVar) {
        this.f10739b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10738a, false, 4988, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10738a, false, 4988, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10739b;
        Long l = (Long) obj;
        if (gcVar.b() != null) {
            ((gc.a) gcVar.b()).a(l.intValue());
            if (l.longValue() <= 0) {
                gcVar.a(gcVar.f10733c.s.f9033a);
                gcVar.f10734d.dispose();
                gcVar.f10734d = null;
            }
        }
    }
}
