package com.ss.android.ugc.aweme.di;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dagger.internal.c;
import dagger.internal.e;

public final class aq implements c<Context> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41411a;

    /* renamed from: b  reason: collision with root package name */
    private final an f41412b;

    public final /* synthetic */ Object get() {
        if (PatchProxy.isSupport(new Object[0], this, f41411a, false, 35327, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f41411a, false, 35327, new Class[0], Context.class);
        }
        an anVar = this.f41412b;
        if (!PatchProxy.isSupport(new Object[]{anVar}, null, f41411a, true, 35328, new Class[]{an.class}, Context.class)) {
            return a(anVar);
        }
        return (Context) PatchProxy.accessDispatch(new Object[]{anVar}, null, f41411a, true, 35328, new Class[]{an.class}, Context.class);
    }

    public static Context a(an anVar) {
        an anVar2 = anVar;
        if (!PatchProxy.isSupport(new Object[]{anVar2}, null, f41411a, true, 35330, new Class[]{an.class}, Context.class)) {
            return (Context) e.a(anVar2.f3023a, "Cannot return null from a non-@Nullable @Provides method");
        }
        return (Context) PatchProxy.accessDispatch(new Object[]{anVar2}, null, f41411a, true, 35330, new Class[]{an.class}, Context.class);
    }
}
