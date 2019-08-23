package com.ss.android.ugc.aweme.live.hostbusiness;

import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.model.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53421a;

    /* renamed from: b  reason: collision with root package name */
    private final c f53422b;

    f(c cVar) {
        this.f53422b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53421a, false, 55700, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53421a, false, 55700, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f53422b;
        a aVar = (a) obj;
        if (cVar != null) {
            cVar.a(new com.bytedance.android.live.base.model.c.a(aVar.f53497a, aVar.f53498b));
        }
    }
}
