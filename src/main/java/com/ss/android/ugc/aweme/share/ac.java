package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.z;
import java.io.File;

public final /* synthetic */ class ac implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64607a;

    /* renamed from: b  reason: collision with root package name */
    private final z.a f64608b;

    ac(z.a aVar) {
        this.f64608b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64607a, false, 73019, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64607a, false, 73019, new Class[]{i.class}, Object.class);
        }
        this.f64608b.a((File) iVar.e());
        return null;
    }
}
