package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10512a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10513b;

    cp(cl clVar) {
        this.f10513b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10512a, false, 4786, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10512a, false, 4786, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10513b;
        clVar.b((Throwable) obj);
        if (!clVar.f10501d) {
            ((cl.a) clVar.b()).e();
            clVar.f10500c = false;
            return;
        }
        clVar.g();
    }
}
