package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10810a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10811b;

    s(n nVar) {
        this.f10811b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10810a, false, 4651, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10810a, false, 4651, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10811b.b((Throwable) obj);
    }
}
