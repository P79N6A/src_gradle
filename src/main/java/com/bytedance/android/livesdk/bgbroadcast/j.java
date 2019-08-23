package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9245a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9246b = new j();

    private j() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9245a, false, 3259, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9245a, false, 3259, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("BgBroadcastFragment", (Throwable) obj);
    }
}
