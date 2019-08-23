package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dt implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12109a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f12110b = new dt();

    private dt() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12109a, false, 6238, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12109a, false, 6238, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("RushRedEnvelopeDialog", (Throwable) obj);
    }
}
