package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17756a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f17757b = new g();

    private g() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17756a, false, 13878, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17756a, false, 13878, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("StartLiveBannerViewModel", (Throwable) obj);
    }
}
