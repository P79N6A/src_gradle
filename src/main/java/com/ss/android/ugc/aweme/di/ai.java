package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.g;
import dagger.internal.c;
import dagger.internal.e;

public final class ai implements c<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41397a;

    /* renamed from: b  reason: collision with root package name */
    static final ai f41398b = new ai();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41397a, false, 35307, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f41397a, false, 35307, new Class[0], g.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41397a, true, 35308, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f41397a, true, 35308, new Class[0], g.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41397a, true, 35309, new Class[0], g.class)) {
                return (g) PatchProxy.accessDispatch(new Object[0], null, f41397a, true, 35309, new Class[0], g.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35192, new Class[0], g.class)) {
                obj = (g) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35192, new Class[0], g.class);
            } else {
                obj = new com.ss.android.ugc.aweme.app.services.a.c();
            }
            return (g) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
