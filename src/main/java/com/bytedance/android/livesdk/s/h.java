package com.bytedance.android.livesdk.s;

import com.bytedance.android.livesdkapi.service.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17129a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17130b;

    h(a aVar) {
        this.f17130b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17129a, false, 12898, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17129a, false, 12898, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
