package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.chatroom.model.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10670a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10671b;

    fd(es esVar) {
        this.f10671b = esVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10670a, false, 4922, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10670a, false, 4922, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10671b;
        b bVar = (b) obj;
        esVar.f10640c = false;
        if (bVar.f7872c == null) {
            ((es.b) esVar.b()).b(new Exception());
        } else {
            ((es.b) esVar.b()).b(((f) bVar.f7872c).f11037a, ((f) bVar.f7872c).f11038b);
        }
    }
}
