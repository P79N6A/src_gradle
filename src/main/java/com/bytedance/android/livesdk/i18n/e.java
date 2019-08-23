package com.bytedance.android.livesdk.i18n;

import com.bytedance.android.livesdk.i18n.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15626a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15627b;

    e(c cVar) {
        this.f15627b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15626a, false, 10168, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15626a, false, 10168, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f15627b;
        c.b bVar = (c.b) obj;
        cVar.f15599f = false;
        if (cVar.f15598e != null) {
            cVar.f15598e.a(cVar.f15597b, bVar);
        }
    }
}
