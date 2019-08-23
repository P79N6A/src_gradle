package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14411a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14412b;

    d(a aVar) {
        this.f14412b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14411a, false, 8918, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14411a, false, 8918, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14412b.f14405b.a((List) obj);
    }
}
