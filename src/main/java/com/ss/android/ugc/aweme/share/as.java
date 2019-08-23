package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ao;
import java.io.File;

public final /* synthetic */ class as implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64674a;

    /* renamed from: b  reason: collision with root package name */
    private final ao.a f64675b;

    as(ao.a aVar) {
        this.f64675b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64674a, false, 73068, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64674a, false, 73068, new Class[]{i.class}, Object.class);
        }
        this.f64675b.a((File) iVar.e());
        return null;
    }
}
