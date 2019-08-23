package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.e;

public final /* synthetic */ class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68721a;

    /* renamed from: b  reason: collision with root package name */
    private final MvTemplateView f68722b;

    i(MvTemplateView mvTemplateView) {
        this.f68722b = mvTemplateView;
    }

    public final void a(int i, int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f68721a, false, 77892, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f68721a, false, 77892, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f68722b.a(i, i2, i3);
    }
}
