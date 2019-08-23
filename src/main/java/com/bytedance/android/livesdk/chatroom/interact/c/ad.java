package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ad implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10363a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10364b;

    ad(x xVar) {
        this.f10364b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10363a, false, 4665, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10363a, false, 4665, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10364b.d();
    }
}
