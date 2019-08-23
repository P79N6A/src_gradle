package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.m;
import com.ss.android.ugc.aweme.main.h.k;
import dagger.internal.c;
import dagger.internal.e;

public final class o implements c<k> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41458a;

    /* renamed from: b  reason: collision with root package name */
    static final o f41459b = new o();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41458a, false, 35247, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, f41458a, false, 35247, new Class[0], k.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41458a, true, 35248, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], null, f41458a, true, 35248, new Class[0], k.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41458a, true, 35249, new Class[0], k.class)) {
                return (k) PatchProxy.accessDispatch(new Object[0], null, f41458a, true, 35249, new Class[0], k.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35198, new Class[0], k.class)) {
                obj = (k) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35198, new Class[0], k.class);
            } else {
                obj = new m();
            }
            return (k) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
