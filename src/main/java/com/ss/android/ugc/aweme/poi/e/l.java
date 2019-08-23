package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;

public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59809a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59810b;

    /* renamed from: c  reason: collision with root package name */
    private final PoiDetail f59811c;

    l(Context context, PoiDetail poiDetail) {
        this.f59810b = context;
        this.f59811c = poiDetail;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f59809a, false, 66856, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f59809a, false, 66856, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59809a, false, 66855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59809a, false, 66855, new Class[0], Void.TYPE);
            return;
        }
        h.a(this.f59810b, this.f59811c);
    }
}
