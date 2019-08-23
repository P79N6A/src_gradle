package com.ss.android.ugc.aweme.hotsearch.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.share.g;
import java.io.File;

public final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49854a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f49855b;

    p(g.a aVar) {
        this.f49855b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49854a, false, 49789, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49854a, false, 49789, new Class[]{i.class}, Object.class);
        }
        g.a aVar = this.f49855b;
        if (!iVar.d() && iVar.e() != null) {
            aVar.a((File) iVar.e());
        }
        return null;
    }
}
