package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.z;
import com.ss.android.ugc.aweme.story.api.e;
import dagger.internal.c;

public final class ae implements c<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41389a;

    /* renamed from: b  reason: collision with root package name */
    static final ae f41390b = new ae();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41389a, false, 35295, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f41389a, false, 35295, new Class[0], e.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41389a, true, 35296, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f41389a, true, 35296, new Class[0], e.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41389a, true, 35297, new Class[0], e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[0], null, f41389a, true, 35297, new Class[0], e.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35191, new Class[0], e.class)) {
                obj = (e) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35191, new Class[0], e.class);
            } else {
                obj = new z();
            }
            return (e) dagger.internal.e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
