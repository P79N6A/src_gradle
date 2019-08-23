package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ex implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10656a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10657b;

    public ex(es esVar) {
        this.f10657b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10656a, false, 4916, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10656a, false, 4916, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10657b;
        Throwable th = (Throwable) obj;
        esVar.b(th);
        esVar.f10641d = false;
        esVar.l.a((Integer) 0);
        if (esVar.k != null) {
            esVar.k.b(th);
        }
    }
}
