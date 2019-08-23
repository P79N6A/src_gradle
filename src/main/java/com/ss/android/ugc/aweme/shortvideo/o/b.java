package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class b implements f<a, com.ss.android.ugc.aweme.s.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68802a;

    @NullableDecl
    /* renamed from: a */
    public final com.ss.android.ugc.aweme.s.a.a apply(@NullableDecl a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f68802a, false, 80098, new Class[]{a.class}, com.ss.android.ugc.aweme.s.a.a.class)) {
            return (com.ss.android.ugc.aweme.s.a.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f68802a, false, 80098, new Class[]{a.class}, com.ss.android.ugc.aweme.s.a.a.class);
        } else if (aVar2 == null) {
            return null;
        } else {
            double[] c2 = com.ss.android.ugc.aweme.poi.e.a.c(aVar2.longitude, aVar2.latitude);
            com.ss.android.ugc.aweme.s.a.a aVar3 = new com.ss.android.ugc.aweme.s.a.a(c2[1], c2[0], aVar2.time);
            return aVar3;
        }
    }
}
