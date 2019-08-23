package com.bytedance.android.livesdk.i18n;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15634a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15635b;

    h(c cVar) {
        this.f15635b = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15634a, false, 10171, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15634a, false, 10171, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f15635b;
        cVar.g = false;
        cVar.a();
    }
}
