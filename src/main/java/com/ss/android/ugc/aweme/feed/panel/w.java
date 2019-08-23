package com.ss.android.ugc.aweme.feed.panel;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45750a;

    /* renamed from: b  reason: collision with root package name */
    private final u f45751b;

    public w(u uVar) {
        this.f45751b = uVar;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f45750a, false, 41932, new Class[]{i.class}, Object.class)) {
            return this.f45751b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f45750a, false, 41932, new Class[]{i.class}, Object.class);
    }
}
