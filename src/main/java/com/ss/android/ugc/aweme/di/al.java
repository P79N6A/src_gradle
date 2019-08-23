package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ad;
import com.ss.android.ugc.aweme.main.h.w;
import dagger.internal.c;
import dagger.internal.e;

public final class al implements c<w> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41403a;

    /* renamed from: b  reason: collision with root package name */
    static final al f41404b = new al();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41403a, false, 35316, new Class[0], w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[0], this, f41403a, false, 35316, new Class[0], w.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41403a, true, 35317, new Class[0], w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[0], null, f41403a, true, 35317, new Class[0], w.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41403a, true, 35318, new Class[0], w.class)) {
                return (w) PatchProxy.accessDispatch(new Object[0], null, f41403a, true, 35318, new Class[0], w.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35210, new Class[0], w.class)) {
                obj = (w) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35210, new Class[0], w.class);
            } else {
                obj = new ad();
            }
            return (w) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
