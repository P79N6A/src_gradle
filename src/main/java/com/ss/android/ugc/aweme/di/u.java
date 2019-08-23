package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.r;
import dagger.internal.c;
import dagger.internal.e;

public final class u implements c<com.ss.android.ugc.aweme.main.h.u> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41470a;

    /* renamed from: b  reason: collision with root package name */
    static final u f41471b = new u();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41470a, false, 35265, new Class[0], com.ss.android.ugc.aweme.main.h.u.class)) {
            return (com.ss.android.ugc.aweme.main.h.u) PatchProxy.accessDispatch(new Object[0], this, f41470a, false, 35265, new Class[0], com.ss.android.ugc.aweme.main.h.u.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41470a, true, 35266, new Class[0], com.ss.android.ugc.aweme.main.h.u.class)) {
            return (com.ss.android.ugc.aweme.main.h.u) PatchProxy.accessDispatch(new Object[0], null, f41470a, true, 35266, new Class[0], com.ss.android.ugc.aweme.main.h.u.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41470a, true, 35267, new Class[0], com.ss.android.ugc.aweme.main.h.u.class)) {
                return (com.ss.android.ugc.aweme.main.h.u) PatchProxy.accessDispatch(new Object[0], null, f41470a, true, 35267, new Class[0], com.ss.android.ugc.aweme.main.h.u.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35204, new Class[0], com.ss.android.ugc.aweme.main.h.u.class)) {
                obj = (com.ss.android.ugc.aweme.main.h.u) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35204, new Class[0], com.ss.android.ugc.aweme.main.h.u.class);
            } else {
                obj = new r();
            }
            return (com.ss.android.ugc.aweme.main.h.u) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
