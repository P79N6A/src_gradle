package com.ss.android.ugc.aweme.qrcode.v2;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63549a;

    /* renamed from: b  reason: collision with root package name */
    private final h f63550b;

    j(h hVar) {
        this.f63550b = hVar;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f63549a, false, 70610, new Class[]{i.class}, Object.class)) {
            return this.f63550b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f63549a, false, 70610, new Class[]{i.class}, Object.class);
    }
}
