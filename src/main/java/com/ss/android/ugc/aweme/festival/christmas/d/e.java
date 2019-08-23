package com.ss.android.ugc.aweme.festival.christmas.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47264a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47265b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.festival.christmas.c.g f47266c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47267d;

    e(c cVar, com.ss.android.ugc.aweme.festival.christmas.c.g gVar, int i) {
        this.f47265b = cVar;
        this.f47266c = gVar;
        this.f47267d = i;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f47264a, false, 43930, new Class[]{i.class}, Object.class)) {
            return this.f47265b.b(this.f47266c, this.f47267d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47264a, false, 43930, new Class[]{i.class}, Object.class);
    }
}
