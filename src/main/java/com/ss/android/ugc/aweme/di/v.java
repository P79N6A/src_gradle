package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.s;
import com.ss.android.ugc.aweme.main.h.o;
import dagger.internal.c;
import dagger.internal.e;

public final class v implements c<o> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41472a;

    /* renamed from: b  reason: collision with root package name */
    static final v f41473b = new v();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41472a, false, 35268, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f41472a, false, 35268, new Class[0], o.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41472a, true, 35269, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], null, f41472a, true, 35269, new Class[0], o.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41472a, true, 35270, new Class[0], o.class)) {
                return (o) PatchProxy.accessDispatch(new Object[0], null, f41472a, true, 35270, new Class[0], o.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35193, new Class[0], o.class)) {
                obj = (o) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35193, new Class[0], o.class);
            } else {
                obj = new s();
            }
            return (o) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
