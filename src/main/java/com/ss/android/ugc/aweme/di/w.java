package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.t;
import com.ss.android.ugc.aweme.main.h.p;
import dagger.internal.c;
import dagger.internal.e;

public final class w implements c<p> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41474a;

    /* renamed from: b  reason: collision with root package name */
    static final w f41475b = new w();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41474a, false, 35271, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], this, f41474a, false, 35271, new Class[0], p.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41474a, true, 35272, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], null, f41474a, true, 35272, new Class[0], p.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41474a, true, 35273, new Class[0], p.class)) {
                return (p) PatchProxy.accessDispatch(new Object[0], null, f41474a, true, 35273, new Class[0], p.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35195, new Class[0], p.class)) {
                obj = (p) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35195, new Class[0], p.class);
            } else {
                obj = new t();
            }
            return (p) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
