package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b;
import com.ss.android.vesdk.p;
import dmt.av.video.n;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68705a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68706b;

    /* renamed from: c  reason: collision with root package name */
    private final p f68707c;

    /* renamed from: d  reason: collision with root package name */
    private final b f68708d;

    e(a aVar, p pVar, b bVar) {
        this.f68706b = aVar;
        this.f68707c = pVar;
        this.f68708d = bVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f68705a, false, 78066, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f68705a, false, 78066, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f68706b;
        p pVar = this.f68707c;
        b bVar = this.f68708d;
        if (!(pVar == null || aVar.h == null)) {
            n.b(pVar, aVar.h);
        }
        if (bVar != null) {
            bVar.a();
        }
        return null;
    }
}
