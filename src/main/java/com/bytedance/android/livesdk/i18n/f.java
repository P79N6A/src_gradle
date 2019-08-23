package com.bytedance.android.livesdk.i18n;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15628a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15629b;

    f(c cVar) {
        this.f15629b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15628a, false, 10169, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15628a, false, 10169, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f15629b;
        Throwable th = (Throwable) obj;
        cVar.f15599f = false;
        if (cVar.f15598e != null) {
            cVar.f15598e.a(cVar.f15597b, new Exception(th));
        }
    }
}
