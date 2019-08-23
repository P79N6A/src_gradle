package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate.b;

public final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68719a;

    /* renamed from: b  reason: collision with root package name */
    private final MvTemplateView f68720b;

    h(MvTemplateView mvTemplateView) {
        this.f68720b = mvTemplateView;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68719a, false, 77891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68719a, false, 77891, new Class[0], Void.TYPE);
            return;
        }
        this.f68720b.setVisibility(8);
    }
}
