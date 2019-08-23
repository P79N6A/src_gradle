package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bt implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9655a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9656b = new bt();

    private bt() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9655a, false, 2943, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9655a, false, 2943, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(6, "StartLiveFragmentC", ((Throwable) obj).getStackTrace());
    }
}
