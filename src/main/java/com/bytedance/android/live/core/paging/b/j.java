package com.bytedance.android.live.core.paging.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7948a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7949b;

    j(c cVar) {
        this.f7949b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7948a, false, 573, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7948a, false, 573, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7949b.b();
    }
}
