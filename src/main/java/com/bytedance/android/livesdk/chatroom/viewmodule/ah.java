package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.gift.impl.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ah implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12973a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftWidget f12974b;

    ah(GiftWidget giftWidget) {
        this.f12974b = giftWidget;
    }

    public final void a(Exception exc, Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{exc, runnable2}, this, f12973a, false, 6905, new Class[]{Exception.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, runnable2}, this, f12973a, false, 6905, new Class[]{Exception.class, Runnable.class}, Void.TYPE);
            return;
        }
        this.f12974b.a((Throwable) exc, runnable2);
    }
}
