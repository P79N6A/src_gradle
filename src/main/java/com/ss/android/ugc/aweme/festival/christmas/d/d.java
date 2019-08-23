package com.ss.android.ugc.aweme.festival.christmas.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47260a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47261b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.festival.christmas.c.g f47262c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47263d;

    d(c cVar, com.ss.android.ugc.aweme.festival.christmas.c.g gVar, String str) {
        this.f47261b = cVar;
        this.f47262c = gVar;
        this.f47263d = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f47260a, false, 43929, new Class[]{i.class}, Object.class)) {
            return this.f47261b.b(this.f47262c, this.f47263d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47260a, false, 43929, new Class[]{i.class}, Object.class);
    }
}
