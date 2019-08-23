package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cr implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10516a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10517b;

    cr(cl clVar) {
        this.f10517b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10516a, false, 4788, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10516a, false, 4788, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10517b.a((Throwable) obj);
    }
}
