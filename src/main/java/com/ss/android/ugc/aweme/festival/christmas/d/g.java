package com.ss.android.ugc.aweme.festival.christmas.d;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47272a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47273b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.festival.christmas.c.g f47274c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47275d;

    g(c cVar, com.ss.android.ugc.aweme.festival.christmas.c.g gVar, int i) {
        this.f47273b = cVar;
        this.f47274c = gVar;
        this.f47275d = i;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f47272a, false, 43932, new Class[]{i.class}, Object.class)) {
            return this.f47273b.a(this.f47274c, this.f47275d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47272a, false, 43932, new Class[]{i.class}, Object.class);
    }
}
