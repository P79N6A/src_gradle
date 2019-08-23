package com.ss.android.ugc.aweme.di;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dagger.android.a;
import dagger.internal.c;
import dagger.internal.e;

public final class ar implements c<a.C0872a<? extends Activity>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41413a;

    /* renamed from: b  reason: collision with root package name */
    private final an f41414b;

    public final /* synthetic */ Object get() {
        if (PatchProxy.isSupport(new Object[0], this, f41413a, false, 35331, new Class[0], a.C0872a.class)) {
            return (a.C0872a) PatchProxy.accessDispatch(new Object[0], this, f41413a, false, 35331, new Class[0], a.C0872a.class);
        }
        an anVar = this.f41414b;
        if (PatchProxy.isSupport(new Object[]{anVar}, null, f41413a, true, 35332, new Class[]{an.class}, a.C0872a.class)) {
            return (a.C0872a) PatchProxy.accessDispatch(new Object[]{anVar}, null, f41413a, true, 35332, new Class[]{an.class}, a.C0872a.class);
        }
        if (!PatchProxy.isSupport(new Object[]{anVar}, null, f41413a, true, 35334, new Class[]{an.class}, a.C0872a.class)) {
            return (a.C0872a) e.a(ao.f41408b, "Cannot return null from a non-@Nullable @Provides method");
        }
        return (a.C0872a) PatchProxy.accessDispatch(new Object[]{anVar}, null, f41413a, true, 35334, new Class[]{an.class}, a.C0872a.class);
    }

    public ar(an anVar) {
        this.f41414b = anVar;
    }
}
