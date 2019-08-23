package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ag implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47485a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47486b;

    ag(FilterScrollerModule filterScrollerModule) {
        this.f47486b = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47485a, false, 44345, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f47485a, false, 44345, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FilterScrollerModule filterScrollerModule = this.f47486b;
        h hVar = (h) obj;
        if (hVar != null) {
            filterScrollerModule.a(hVar);
            filterScrollerModule.g.c(hVar);
        }
    }
}
