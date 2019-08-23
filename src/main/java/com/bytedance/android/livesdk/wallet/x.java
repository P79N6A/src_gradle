package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class x implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18165a;

    /* renamed from: b  reason: collision with root package name */
    private final v f18166b;

    x(v vVar) {
        this.f18166b = vVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18165a, false, 14002, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18165a, false, 14002, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f18166b.a((c) obj);
    }
}
