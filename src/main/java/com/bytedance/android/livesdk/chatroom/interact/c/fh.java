package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10678a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10679b;

    fh(es esVar) {
        this.f10679b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10678a, false, 4926, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10678a, false, 4926, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10679b;
        esVar.f10643f = false;
        if (esVar.k != null) {
            esVar.k.b();
        }
        e.a().b();
        esVar.i();
    }
}
