package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ds implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10580a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10581b;

    ds(cy cyVar) {
        this.f10581b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10580a, false, 4843, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10580a, false, 4843, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10581b.a((Throwable) obj);
    }
}
