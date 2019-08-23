package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class co implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13578a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13579b = new co();

    private co() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13578a, false, 2964, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13578a, false, 2964, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("StartLiveFragmentC", (Throwable) obj);
    }
}
