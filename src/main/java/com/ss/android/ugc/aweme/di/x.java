package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.u;
import com.ss.android.ugc.aweme.main.h.a.a;
import dagger.internal.c;
import dagger.internal.e;

public final class x implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41476a;

    /* renamed from: b  reason: collision with root package name */
    static final x f41477b = new x();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41476a, false, 35274, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f41476a, false, 35274, new Class[0], a.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41476a, true, 35275, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f41476a, true, 35275, new Class[0], a.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41476a, true, 35276, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], null, f41476a, true, 35276, new Class[0], a.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35187, new Class[0], a.class)) {
                obj = (a) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35187, new Class[0], a.class);
            } else {
                obj = new u();
            }
            return (a) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
