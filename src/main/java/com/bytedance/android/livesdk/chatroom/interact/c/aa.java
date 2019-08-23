package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aa implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10355a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10356b;

    aa(x xVar) {
        this.f10356b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10355a, false, 4662, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10355a, false, 4662, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10356b.c((Throwable) obj);
    }
}
