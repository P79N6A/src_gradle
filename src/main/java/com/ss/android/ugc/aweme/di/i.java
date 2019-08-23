package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.d;
import com.ss.android.ugc.aweme.main.h.f;
import dagger.internal.c;
import dagger.internal.e;

public final class i implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41446a;

    /* renamed from: b  reason: collision with root package name */
    static final i f41447b = new i();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41446a, false, 35229, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f41446a, false, 35229, new Class[0], f.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41446a, true, 35230, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f41446a, true, 35230, new Class[0], f.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41446a, true, 35231, new Class[0], f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[0], null, f41446a, true, 35231, new Class[0], f.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35200, new Class[0], f.class)) {
                obj = (f) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35200, new Class[0], f.class);
            } else {
                obj = new d();
            }
            return (f) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
