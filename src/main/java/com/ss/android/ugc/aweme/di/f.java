package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.h.b;
import dagger.internal.c;
import dagger.internal.e;

public final class f implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41440a;

    /* renamed from: b  reason: collision with root package name */
    static final f f41441b = new f();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41440a, false, 35220, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f41440a, false, 35220, new Class[0], b.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41440a, true, 35221, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f41440a, true, 35221, new Class[0], b.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41440a, true, 35222, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], null, f41440a, true, 35222, new Class[0], b.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35201, new Class[0], b.class)) {
                obj = (b) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35201, new Class[0], b.class);
            } else {
                obj = new com.ss.android.ugc.aweme.app.services.b();
            }
            return (b) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
