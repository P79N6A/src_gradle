package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aq implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47520a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterViewImpl f47521b;

    aq(FilterViewImpl filterViewImpl) {
        this.f47521b = filterViewImpl;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47520a, false, 44397, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f47520a, false, 44397, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FilterViewImpl filterViewImpl = this.f47521b;
        h hVar = (h) obj;
        if (w.b(hVar)) {
            filterViewImpl.g.c(hVar);
        }
    }
}
