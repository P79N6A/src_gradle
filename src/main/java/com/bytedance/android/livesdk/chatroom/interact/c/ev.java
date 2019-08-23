package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ev implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10652a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10653b;

    ev(es esVar) {
        this.f10653b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10652a, false, 4914, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10652a, false, 4914, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10653b;
        Throwable th = (Throwable) obj;
        esVar.f10643f = false;
        esVar.b(th);
        if (esVar.i) {
            if (esVar.k != null) {
                esVar.k.b();
            }
            e.a().b();
            esVar.i();
            return;
        }
        if (esVar.k != null) {
            esVar.k.a(th);
        }
    }
}
