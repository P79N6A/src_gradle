package com.bytedance.android.livesdk.i18n;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15636a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15637b;

    i(c cVar) {
        this.f15637b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15636a, false, 10172, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15636a, false, 10172, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f15637b;
        Throwable th = (Throwable) obj;
        cVar.g = false;
        if (cVar.f15598e != null) {
            new Exception(th);
        }
        cVar.a();
    }
}
