package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.h.a;
import dagger.internal.c;

public final class e implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41438a;

    /* renamed from: b  reason: collision with root package name */
    static final e f41439b = new e();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41438a, false, 35217, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f41438a, false, 35217, new Class[0], a.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41438a, true, 35218, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f41438a, true, 35218, new Class[0], a.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41438a, true, 35219, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], null, f41438a, true, 35219, new Class[0], a.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35202, new Class[0], a.class)) {
                obj = (a) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35202, new Class[0], a.class);
            } else {
                obj = new com.ss.android.ugc.aweme.app.services.a();
            }
            return (a) dagger.internal.e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
