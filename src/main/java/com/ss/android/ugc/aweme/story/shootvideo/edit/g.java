package com.ss.android.ugc.aweme.story.shootvideo.edit;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.view.c;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73482a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73483b;

    /* renamed from: c  reason: collision with root package name */
    private final c f73484c;

    g(a aVar, c cVar) {
        this.f73483b = aVar;
        this.f73484c = cVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f73482a, false, 85245, new Class[]{i.class}, Object.class)) {
            return this.f73483b.a(this.f73484c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f73482a, false, 85245, new Class[]{i.class}, Object.class);
    }
}
