package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.o;
import com.ss.android.ugc.aweme.main.h.l;
import dagger.internal.c;
import dagger.internal.e;

public final class q implements c<l> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41462a;

    /* renamed from: b  reason: collision with root package name */
    static final q f41463b = new q();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41462a, false, 35253, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], this, f41462a, false, 35253, new Class[0], l.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41462a, true, 35254, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], null, f41462a, true, 35254, new Class[0], l.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41462a, true, 35255, new Class[0], l.class)) {
                return (l) PatchProxy.accessDispatch(new Object[0], null, f41462a, true, 35255, new Class[0], l.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35197, new Class[0], l.class)) {
                obj = (l) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35197, new Class[0], l.class);
            } else {
                obj = new o();
            }
            return (l) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
