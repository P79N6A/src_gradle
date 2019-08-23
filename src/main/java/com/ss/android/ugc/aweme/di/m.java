package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.k;
import com.ss.android.ugc.aweme.main.h.i;
import dagger.internal.c;
import dagger.internal.e;

public final class m implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41454a;

    /* renamed from: b  reason: collision with root package name */
    static final m f41455b = new m();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41454a, false, 35241, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f41454a, false, 35241, new Class[0], i.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41454a, true, 35242, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f41454a, true, 35242, new Class[0], i.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41454a, true, 35243, new Class[0], i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[0], null, f41454a, true, 35243, new Class[0], i.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35196, new Class[0], i.class)) {
                obj = (i) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35196, new Class[0], i.class);
            } else {
                obj = new k();
            }
            return (i) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
