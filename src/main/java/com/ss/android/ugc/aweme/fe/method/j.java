package com.ss.android.ugc.aweme.fe.method;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44596a;

    /* renamed from: b  reason: collision with root package name */
    private final ZhimaMethod f44597b;

    j(ZhimaMethod zhimaMethod) {
        this.f44597b = zhimaMethod;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f44596a, false, 39845, new Class[]{i.class}, Object.class)) {
            return this.f44597b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f44596a, false, 39845, new Class[]{i.class}, Object.class);
    }
}
