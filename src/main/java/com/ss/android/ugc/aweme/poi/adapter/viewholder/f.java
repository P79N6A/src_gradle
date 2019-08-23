package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class f implements com.ss.android.ugc.aweme.base.component.f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59680a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedDetailViewHolder f59681b;

    f(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f59681b = poiOptimizedDetailViewHolder;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f59680a, false, 64876, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f59680a, false, 64876, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59680a, false, 64875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59680a, false, 64875, new Class[0], Void.TYPE);
            return;
        }
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f59681b;
        e.a(poiOptimizedDetailViewHolder.f59578b, poiOptimizedDetailViewHolder.f59579c.getBookUrl(), poiOptimizedDetailViewHolder.f59578b.getResources().getString(C0906R.string.bpd));
    }
}
