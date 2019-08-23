package com.bytedance.android.live.core.paging.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7935a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7936b;

    d(c cVar) {
        this.f7936b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7935a, false, 569, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7935a, false, 569, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f7936b;
        if (cVar.j != null) {
            cVar.j.run();
            cVar.j = null;
        }
    }
}
