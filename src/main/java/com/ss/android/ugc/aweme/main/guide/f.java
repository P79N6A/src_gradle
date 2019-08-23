package com.ss.android.ugc.aweme.main.guide;

import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54827a;

    /* renamed from: b  reason: collision with root package name */
    private final e f54828b;

    public f(e eVar) {
        this.f54828b = eVar;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (PatchProxy.isSupport(new Object[]{viewStub, view}, this, f54827a, false, 58086, new Class[]{ViewStub.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewStub, view}, this, f54827a, false, 58086, new Class[]{ViewStub.class, View.class}, Void.TYPE);
            return;
        }
        this.f54828b.f54824d = true;
    }
}
