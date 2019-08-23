package com.bytedance.android.livesdk.s;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17118a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f17119b = new d();

    private d() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17118a, false, 12862, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17118a, false, 12862, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("LiveFeedEventImpl", (Throwable) obj);
    }
}
