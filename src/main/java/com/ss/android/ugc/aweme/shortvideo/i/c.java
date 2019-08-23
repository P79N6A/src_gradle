package com.ss.android.ugc.aweme.shortvideo.i;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68196a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68197b;

    c(a aVar) {
        this.f68197b = aVar;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f68196a, false, 78289, new Class[]{i.class}, Object.class)) {
            return this.f68197b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f68196a, false, 78289, new Class[]{i.class}, Object.class);
    }
}
