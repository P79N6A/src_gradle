package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class as implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9064a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9065b = new as();

    private as() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9064a, false, 2794, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9064a, false, 2794, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(6, "StartLiveBaseFragment", ((Throwable) obj).getStackTrace());
    }
}
