package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.i;
import com.ss.android.ugc.aweme.main.h.g;
import dagger.internal.c;
import dagger.internal.e;

public final class j implements c<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41448a;

    /* renamed from: b  reason: collision with root package name */
    static final j f41449b = new j();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41448a, false, 35232, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f41448a, false, 35232, new Class[0], g.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41448a, true, 35233, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f41448a, true, 35233, new Class[0], g.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41448a, true, 35234, new Class[0], g.class)) {
                return (g) PatchProxy.accessDispatch(new Object[0], null, f41448a, true, 35234, new Class[0], g.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35185, new Class[0], g.class)) {
                obj = (g) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35185, new Class[0], g.class);
            } else {
                obj = new i();
            }
            return (g) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
