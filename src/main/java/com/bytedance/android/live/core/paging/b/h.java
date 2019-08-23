package com.bytedance.android.live.core.paging.b;

import com.bytedance.android.live.core.paging.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7944a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7945b;

    /* renamed from: c  reason: collision with root package name */
    private final d f7946c;

    h(c cVar, d dVar) {
        this.f7945b = cVar;
        this.f7946c = dVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7944a, false, 572, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7944a, false, 572, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f7945b;
        d dVar = this.f7946c;
        if (!cVar.a()) {
            dVar.b(true);
            cVar.invalidate();
        }
    }
}
