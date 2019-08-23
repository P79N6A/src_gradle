package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18142a;

    /* renamed from: b  reason: collision with root package name */
    private final p f18143b;

    r(p pVar) {
        this.f18143b = pVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18142a, false, 13979, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18142a, false, 13979, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f18143b.a((c) obj);
    }
}
