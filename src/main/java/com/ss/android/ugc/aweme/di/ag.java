package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.aa;
import com.ss.android.ugc.aweme.story.api.f;
import dagger.internal.c;
import dagger.internal.e;

public final class ag implements c<f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41393a;

    /* renamed from: b  reason: collision with root package name */
    static final ag f41394b = new ag();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41393a, false, 35301, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f41393a, false, 35301, new Class[0], f.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41393a, true, 35302, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f41393a, true, 35302, new Class[0], f.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41393a, true, 35303, new Class[0], f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[0], null, f41393a, true, 35303, new Class[0], f.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35190, new Class[0], f.class)) {
                obj = (f) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35190, new Class[0], f.class);
            } else {
                obj = new aa();
            }
            return (f) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
