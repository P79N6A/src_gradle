package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.gc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10760a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10761b;

    gp(gc gcVar) {
        this.f10761b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10760a, false, 4999, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10760a, false, 4999, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10761b;
        Long l = (Long) obj;
        if (gcVar.b() != null) {
            ((gc.a) gcVar.b()).b(l.intValue());
            if (l.longValue() <= 0) {
                gcVar.a();
            }
        }
    }
}
