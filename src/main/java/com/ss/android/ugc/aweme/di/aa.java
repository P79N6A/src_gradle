package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.w;
import com.ss.android.ugc.aweme.story.api.d;
import dagger.internal.c;
import dagger.internal.e;

public final class aa implements c<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41381a;

    /* renamed from: b  reason: collision with root package name */
    static final aa f41382b = new aa();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41381a, false, 35283, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f41381a, false, 35283, new Class[0], d.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41381a, true, 35284, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f41381a, true, 35284, new Class[0], d.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41381a, true, 35285, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], null, f41381a, true, 35285, new Class[0], d.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35188, new Class[0], d.class)) {
                obj = (d) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35188, new Class[0], d.class);
            } else {
                obj = new w();
            }
            return (d) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
