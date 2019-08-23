package com.ss.android.ugc.aweme.live.hostbusiness;

import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53423a;

    /* renamed from: b  reason: collision with root package name */
    private final c f53424b;

    g(c cVar) {
        this.f53424b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53423a, false, 55701, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53423a, false, 55701, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f53424b;
        if (cVar != null) {
            cVar.a(new a(false, ""));
        }
    }
}
