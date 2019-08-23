package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.y;
import com.ss.android.ugc.aweme.main.h.s;
import dagger.internal.c;
import dagger.internal.e;

public final class ad implements c<s> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41387a;

    /* renamed from: b  reason: collision with root package name */
    static final ad f41388b = new ad();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41387a, false, 35292, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], this, f41387a, false, 35292, new Class[0], s.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41387a, true, 35293, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f41387a, true, 35293, new Class[0], s.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41387a, true, 35294, new Class[0], s.class)) {
                return (s) PatchProxy.accessDispatch(new Object[0], null, f41387a, true, 35294, new Class[0], s.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35186, new Class[0], s.class)) {
                obj = (s) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35186, new Class[0], s.class);
            } else {
                obj = new y();
            }
            return (s) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
