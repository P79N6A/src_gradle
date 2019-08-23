package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ah;
import java.io.File;

public final /* synthetic */ class am implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64646a;

    /* renamed from: b  reason: collision with root package name */
    private final ah.a f64647b;

    am(ah.a aVar) {
        this.f64647b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64646a, false, 73048, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64646a, false, 73048, new Class[]{i.class}, Object.class);
        }
        this.f64647b.a((File) iVar.e());
        return null;
    }
}
