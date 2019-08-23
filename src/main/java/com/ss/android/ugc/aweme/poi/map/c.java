package com.ss.android.ugc.aweme.poi.map;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements com.ss.android.ugc.aweme.map.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59853a;

    /* renamed from: b  reason: collision with root package name */
    private final l f59854b;

    c(l lVar) {
        this.f59854b = lVar;
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f59853a, false, 64974, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f59853a, false, 64974, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        l lVar = this.f59854b;
        if (lVar != null) {
            lVar.a(d2, d3);
        }
    }
}
