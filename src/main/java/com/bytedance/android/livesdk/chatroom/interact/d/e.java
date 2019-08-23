package com.bytedance.android.livesdk.chatroom.interact.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10847a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10848b;

    e(a aVar) {
        this.f10848b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10847a, false, 5049, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10847a, false, 5049, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10848b.a((Throwable) obj);
    }
}
