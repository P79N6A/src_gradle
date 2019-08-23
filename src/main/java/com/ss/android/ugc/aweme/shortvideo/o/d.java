package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.recommend.a.a;
import com.ss.android.ugc.aweme.shortvideo.g;
import javax.annotation.Nullable;

public final class d implements f<a, g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68804a;

    @Nullable
    public final /* synthetic */ Object apply(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f68804a, false, 80101, new Class[]{a.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{aVar}, this, f68804a, false, 80101, new Class[]{a.class}, g.class);
        }
        g gVar = new g();
        gVar.f67834a = aVar.f35407a;
        gVar.f67835b = aVar.f35408b;
        gVar.f67836c = new a().apply(aVar.f35409c);
        gVar.f67837d = aVar.f35410d;
        return gVar;
    }
}
