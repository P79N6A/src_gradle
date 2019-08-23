package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import dagger.internal.c;
import dagger.internal.e;

public final class ap implements c<k> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41409a;

    /* renamed from: b  reason: collision with root package name */
    private final an f41410b;

    public final /* synthetic */ Object get() {
        if (PatchProxy.isSupport(new Object[0], this, f41409a, false, 35323, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, f41409a, false, 35323, new Class[0], k.class);
        }
        an anVar = this.f41410b;
        if (PatchProxy.isSupport(new Object[]{anVar}, null, f41409a, true, 35324, new Class[]{an.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{anVar}, null, f41409a, true, 35324, new Class[]{an.class}, k.class);
        }
        if (!PatchProxy.isSupport(new Object[]{anVar}, null, f41409a, true, 35326, new Class[]{an.class}, k.class)) {
            return (k) e.a(anVar.f3023a, "Cannot return null from a non-@Nullable @Provides method");
        }
        return (k) PatchProxy.accessDispatch(new Object[]{anVar}, null, f41409a, true, 35326, new Class[]{an.class}, k.class);
    }

    public ap(an anVar) {
        this.f41410b = anVar;
    }
}
