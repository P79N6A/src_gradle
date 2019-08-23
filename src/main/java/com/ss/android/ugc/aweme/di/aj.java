package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ac;
import dagger.internal.c;
import dagger.internal.e;

public final class aj implements c<com.ss.android.ugc.aweme.main.h.c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41399a;

    /* renamed from: b  reason: collision with root package name */
    static final aj f41400b = new aj();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41399a, false, 35310, new Class[0], com.ss.android.ugc.aweme.main.h.c.class)) {
            return (com.ss.android.ugc.aweme.main.h.c) PatchProxy.accessDispatch(new Object[0], this, f41399a, false, 35310, new Class[0], com.ss.android.ugc.aweme.main.h.c.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41399a, true, 35311, new Class[0], com.ss.android.ugc.aweme.main.h.c.class)) {
            return (com.ss.android.ugc.aweme.main.h.c) PatchProxy.accessDispatch(new Object[0], null, f41399a, true, 35311, new Class[0], com.ss.android.ugc.aweme.main.h.c.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41399a, true, 35312, new Class[0], com.ss.android.ugc.aweme.main.h.c.class)) {
                return (com.ss.android.ugc.aweme.main.h.c) PatchProxy.accessDispatch(new Object[0], null, f41399a, true, 35312, new Class[0], com.ss.android.ugc.aweme.main.h.c.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35209, new Class[0], com.ss.android.ugc.aweme.main.h.c.class)) {
                obj = (com.ss.android.ugc.aweme.main.h.c) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35209, new Class[0], com.ss.android.ugc.aweme.main.h.c.class);
            } else {
                obj = new ac();
            }
            return (com.ss.android.ugc.aweme.main.h.c) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
