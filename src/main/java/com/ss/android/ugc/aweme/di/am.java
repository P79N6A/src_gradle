package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ae;
import com.ss.android.ugc.aweme.main.h.v;
import dagger.internal.c;
import dagger.internal.e;

public final class am implements c<v> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41405a;

    /* renamed from: b  reason: collision with root package name */
    static final am f41406b = new am();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41405a, false, 35319, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], this, f41405a, false, 35319, new Class[0], v.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41405a, true, 35320, new Class[0], v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[0], null, f41405a, true, 35320, new Class[0], v.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41405a, true, 35321, new Class[0], v.class)) {
                return (v) PatchProxy.accessDispatch(new Object[0], null, f41405a, true, 35321, new Class[0], v.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35183, new Class[0], v.class)) {
                obj = (v) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35183, new Class[0], v.class);
            } else {
                obj = new ae();
            }
            return (v) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
