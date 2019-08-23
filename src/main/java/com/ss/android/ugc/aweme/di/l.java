package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.j;
import com.ss.android.ugc.aweme.main.h.h;
import dagger.internal.c;
import dagger.internal.e;

public final class l implements c<h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41452a;

    /* renamed from: b  reason: collision with root package name */
    static final l f41453b = new l();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41452a, false, 35238, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f41452a, false, 35238, new Class[0], h.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41452a, true, 35239, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f41452a, true, 35239, new Class[0], h.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41452a, true, 35240, new Class[0], h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[0], null, f41452a, true, 35240, new Class[0], h.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35199, new Class[0], h.class)) {
                obj = (h) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35199, new Class[0], h.class);
            } else {
                obj = new j();
            }
            return (h) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
