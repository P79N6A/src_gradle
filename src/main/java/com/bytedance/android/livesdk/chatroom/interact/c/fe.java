package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.chatroom.model.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fe implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10672a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10673b;

    fe(es esVar) {
        this.f10673b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10672a, false, 4923, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10672a, false, 4923, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10673b;
        Throwable th = (Throwable) obj;
        esVar.b(th);
        esVar.f10640c = false;
        if (th instanceof a) {
            a aVar = (a) th;
            if (aVar.getErrorCode() == 31002) {
                f fVar = (f) com.bytedance.android.live.a.a().fromJson(aVar.getExtra(), f.class);
                if (fVar == null) {
                    ((es.b) esVar.b()).b(aVar);
                } else {
                    ((es.b) esVar.b()).a(fVar.f11037a, fVar.f11038b);
                }
            } else {
                ((es.b) esVar.b()).b(aVar);
            }
            return;
        }
        ((es.b) esVar.b()).b(th);
    }
}
