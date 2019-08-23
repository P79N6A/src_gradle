package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.p;
import com.ss.android.ugc.aweme.main.h.m;
import dagger.internal.c;
import dagger.internal.e;

public final class s implements c<m> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41466a;

    /* renamed from: b  reason: collision with root package name */
    static final s f41467b = new s();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41466a, false, 35259, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, f41466a, false, 35259, new Class[0], m.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41466a, true, 35260, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], null, f41466a, true, 35260, new Class[0], m.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41466a, true, 35261, new Class[0], m.class)) {
                return (m) PatchProxy.accessDispatch(new Object[0], null, f41466a, true, 35261, new Class[0], m.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35184, new Class[0], m.class)) {
                obj = (m) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35184, new Class[0], m.class);
            } else {
                obj = new p();
            }
            return (m) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
