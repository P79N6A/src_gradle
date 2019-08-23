package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ab;
import com.ss.android.ugc.aweme.main.h.t;
import dagger.internal.c;
import dagger.internal.e;

public final class ah implements c<t> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41395a;

    /* renamed from: b  reason: collision with root package name */
    static final ah f41396b = new ah();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41395a, false, 35304, new Class[0], t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[0], this, f41395a, false, 35304, new Class[0], t.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41395a, true, 35305, new Class[0], t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[0], null, f41395a, true, 35305, new Class[0], t.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41395a, true, 35306, new Class[0], t.class)) {
                return (t) PatchProxy.accessDispatch(new Object[0], null, f41395a, true, 35306, new Class[0], t.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35189, new Class[0], t.class)) {
                obj = (t) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35189, new Class[0], t.class);
            } else {
                obj = new ab();
            }
            return (t) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
