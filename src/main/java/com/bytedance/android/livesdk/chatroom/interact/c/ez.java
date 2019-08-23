package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ez implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10660a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10661b;

    ez(es esVar) {
        this.f10661b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10660a, false, 4918, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10660a, false, 4918, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10661b;
        Throwable th = (Throwable) obj;
        esVar.b(th);
        esVar.f10642e = false;
        if (!(th instanceof a) || ((a) th).getErrorCode() != 40001) {
            ((es.b) esVar.b()).c(th);
            return;
        }
        ((es.b) esVar.b()).h();
        esVar.i();
    }
}
