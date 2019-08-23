package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.h.d;
import dagger.internal.c;
import dagger.internal.e;

public final class g implements c<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41442a;

    /* renamed from: b  reason: collision with root package name */
    static final g f41443b = new g();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41442a, false, 35223, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f41442a, false, 35223, new Class[0], d.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41442a, true, 35224, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f41442a, true, 35224, new Class[0], d.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41442a, true, 35225, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], null, f41442a, true, 35225, new Class[0], d.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35194, new Class[0], d.class)) {
                obj = (d) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35194, new Class[0], d.class);
            } else {
                obj = new com.ss.android.ugc.aweme.app.services.c();
            }
            return (d) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
