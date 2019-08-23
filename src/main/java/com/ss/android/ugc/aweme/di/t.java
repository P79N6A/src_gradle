package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.q;
import com.ss.android.ugc.aweme.main.h.n;
import dagger.internal.c;
import dagger.internal.e;

public final class t implements c<n> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41468a;

    /* renamed from: b  reason: collision with root package name */
    static final t f41469b = new t();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41468a, false, 35262, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], this, f41468a, false, 35262, new Class[0], n.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41468a, true, 35263, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], null, f41468a, true, 35263, new Class[0], n.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41468a, true, 35264, new Class[0], n.class)) {
                return (n) PatchProxy.accessDispatch(new Object[0], null, f41468a, true, 35264, new Class[0], n.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35206, new Class[0], n.class)) {
                obj = (n) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35206, new Class[0], n.class);
            } else {
                obj = new q();
            }
            return (n) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
