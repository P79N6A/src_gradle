package com.ss.android.ugc.aweme.poi.map;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.map.d;

public final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59851a;

    /* renamed from: b  reason: collision with root package name */
    private final MapLayout f59852b;

    b(MapLayout mapLayout) {
        this.f59852b = mapLayout;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59851a, false, 64973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59851a, false, 64973, new Class[0], Void.TYPE);
            return;
        }
        MapLayout mapLayout = this.f59852b;
        if (mapLayout.f59840f != null) {
            mapLayout.f59840f.V_();
        }
    }
}
