package com.bytedance.android.livesdk.wallet;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17943a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f17944b;

    aj(ae aeVar) {
        this.f17944b = aeVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17943a, false, 14129, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17943a, false, 14129, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17944b.a((Throwable) obj);
    }
}
