package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fa implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10664a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10665b;

    fa(es esVar) {
        this.f10665b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10664a, false, 4919, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10664a, false, 4919, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10665b;
        esVar.b((Throwable) obj);
        esVar.f10639b = false;
        ((es.b) esVar.b()).b();
    }
}
