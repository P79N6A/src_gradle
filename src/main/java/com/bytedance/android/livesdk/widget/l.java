package com.bytedance.android.livesdk.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18496a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f18497b = new l();

    private l() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18496a, false, 14423, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18496a, false, 14423, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("LiveCoverController", (Throwable) obj);
    }
}
