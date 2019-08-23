package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bc implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11274a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11275b;

    bc(au auVar) {
        this.f11275b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11274a, false, 5272, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11274a, false, 5272, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11275b.b((Throwable) obj);
    }
}
