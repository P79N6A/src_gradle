package com.ss.android.ugc.aweme.festival.christmas.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47268a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47269b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.festival.christmas.c.g f47270c;

    /* renamed from: d  reason: collision with root package name */
    private final String f47271d;

    f(c cVar, com.ss.android.ugc.aweme.festival.christmas.c.g gVar, String str) {
        this.f47269b = cVar;
        this.f47270c = gVar;
        this.f47271d = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f47268a, false, 43931, new Class[]{i.class}, Object.class)) {
            return this.f47269b.a(this.f47270c, this.f47271d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47268a, false, 43931, new Class[]{i.class}, Object.class);
    }
}
