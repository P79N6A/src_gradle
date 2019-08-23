package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.v;
import com.ss.android.ugc.aweme.main.h.q;
import dagger.internal.c;
import dagger.internal.e;

public final class z implements c<q> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41480a;

    /* renamed from: b  reason: collision with root package name */
    static final z f41481b = new z();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41480a, false, 35280, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], this, f41480a, false, 35280, new Class[0], q.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41480a, true, 35281, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], null, f41480a, true, 35281, new Class[0], q.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41480a, true, 35282, new Class[0], q.class)) {
                return (q) PatchProxy.accessDispatch(new Object[0], null, f41480a, true, 35282, new Class[0], q.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35207, new Class[0], q.class)) {
                obj = (q) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35207, new Class[0], q.class);
            } else {
                obj = new v();
            }
            return (q) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
