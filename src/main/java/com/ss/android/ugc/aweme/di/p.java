package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.n;
import com.ss.android.ugc.aweme.story.api.b;
import dagger.internal.c;
import dagger.internal.e;

public final class p implements c<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41460a;

    /* renamed from: b  reason: collision with root package name */
    static final p f41461b = new p();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41460a, false, 35250, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f41460a, false, 35250, new Class[0], b.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41460a, true, 35251, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f41460a, true, 35251, new Class[0], b.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41460a, true, 35252, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], null, f41460a, true, 35252, new Class[0], b.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35205, new Class[0], b.class)) {
                obj = (b) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35205, new Class[0], b.class);
            } else {
                obj = new n();
            }
            return (b) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
