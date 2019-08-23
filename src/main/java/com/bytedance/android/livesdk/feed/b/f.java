package com.bytedance.android.livesdk.feed.b;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14006a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f14007b = new f();

    private f() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14006a, false, 8583, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14006a, false, 8583, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("Tab Request", (Throwable) obj);
    }
}
