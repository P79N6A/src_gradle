package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10812a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10813b;

    t(n nVar) {
        this.f10813b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10812a, false, 4652, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10812a, false, 4652, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10813b.e();
    }
}
