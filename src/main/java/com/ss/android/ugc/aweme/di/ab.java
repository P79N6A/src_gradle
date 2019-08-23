package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.x;
import com.ss.android.ugc.aweme.main.h.r;
import dagger.internal.c;
import dagger.internal.e;

public final class ab implements c<r> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41383a;

    /* renamed from: b  reason: collision with root package name */
    static final ab f41384b = new ab();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41383a, false, 35286, new Class[0], r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[0], this, f41383a, false, 35286, new Class[0], r.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41383a, true, 35287, new Class[0], r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[0], null, f41383a, true, 35287, new Class[0], r.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41383a, true, 35288, new Class[0], r.class)) {
                return (r) PatchProxy.accessDispatch(new Object[0], null, f41383a, true, 35288, new Class[0], r.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35182, new Class[0], r.class)) {
                obj = (r) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35182, new Class[0], r.class);
            } else {
                obj = new x();
            }
            return (r) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
