package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10818a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10819b;

    w(n nVar) {
        this.f10819b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10818a, false, 4655, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10818a, false, 4655, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10819b.c((Throwable) obj);
    }
}
