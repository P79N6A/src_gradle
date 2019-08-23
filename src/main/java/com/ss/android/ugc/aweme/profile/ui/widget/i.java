package com.ss.android.ugc.aweme.profile.ui.widget;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63150a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendUserCardViewHolder f63151b;

    i(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        this.f63151b = recommendUserCardViewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63150a, false, 69834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63150a, false, 69834, new Class[0], Void.TYPE);
            return;
        }
        this.f63151b.a();
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f63150a, false, 69835, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f63150a, false, 69835, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
