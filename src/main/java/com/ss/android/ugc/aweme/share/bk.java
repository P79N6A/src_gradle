package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.bh;
import java.io.File;

public final /* synthetic */ class bk implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64796a;

    /* renamed from: b  reason: collision with root package name */
    private final bh.a f64797b;

    bk(bh.a aVar) {
        this.f64797b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64796a, false, 73158, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64796a, false, 73158, new Class[]{i.class}, Object.class);
        }
        this.f64797b.a((File) iVar.e());
        return null;
    }
}
