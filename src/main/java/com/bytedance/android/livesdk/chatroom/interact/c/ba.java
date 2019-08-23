package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ba implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10411a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10412b;

    ba(ay ayVar) {
        this.f10412b = ayVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10411a, false, 4701, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10411a, false, 4701, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10412b.b((Throwable) obj);
    }
}
