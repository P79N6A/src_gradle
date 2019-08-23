package com.ss.android.ugc.aweme.poi.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60816a;

    /* renamed from: b  reason: collision with root package name */
    private final j f60817b;

    k(j jVar) {
        this.f60817b = jVar;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f60816a, false, 66017, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f60816a, false, 66017, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60816a, false, 66016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60816a, false, 66016, new Class[0], Void.TYPE);
            return;
        }
        this.f60817b.b();
    }
}
