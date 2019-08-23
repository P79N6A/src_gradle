package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.l;
import com.ss.android.ugc.aweme.main.h.j;
import dagger.internal.c;
import dagger.internal.e;

public final class n implements c<j> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41456a;

    /* renamed from: b  reason: collision with root package name */
    static final n f41457b = new n();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41456a, false, 35244, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, f41456a, false, 35244, new Class[0], j.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41456a, true, 35245, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f41456a, true, 35245, new Class[0], j.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41456a, true, 35246, new Class[0], j.class)) {
                return (j) PatchProxy.accessDispatch(new Object[0], null, f41456a, true, 35246, new Class[0], j.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35203, new Class[0], j.class)) {
                obj = (j) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35203, new Class[0], j.class);
            } else {
                obj = new l();
            }
            return (j) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
