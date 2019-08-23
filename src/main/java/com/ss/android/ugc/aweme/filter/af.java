package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47483a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47484b;

    af(FilterScrollerModule filterScrollerModule) {
        this.f47484b = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47483a, false, 44344, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f47483a, false, 44344, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FilterScrollerModule filterScrollerModule = this.f47484b;
        h hVar = (h) obj;
        if (hVar != null) {
            filterScrollerModule.a(false);
            if (!filterScrollerModule.g.b(hVar)) {
                filterScrollerModule.k = hVar;
                return;
            }
            filterScrollerModule.a(hVar);
        }
    }
}
