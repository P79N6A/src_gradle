package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dr implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12104a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f12105b = new dr();

    private dr() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12104a, false, 6236, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12104a, false, 6236, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("RushRedEnvelopeDialog", (Throwable) obj);
    }
}
