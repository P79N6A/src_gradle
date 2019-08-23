package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13198a;

    /* renamed from: b  reason: collision with root package name */
    private final BarrageWidget f13199b;

    e(BarrageWidget barrageWidget) {
        this.f13199b = barrageWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13198a, false, 6572, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13198a, false, 6572, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13199b.a((Throwable) obj);
    }
}
