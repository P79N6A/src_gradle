package com.ss.android.ugc.aweme.account.j;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.r;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32015a;

    /* renamed from: b  reason: collision with root package name */
    static final g f32016b = new d();

    private d() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f32015a, false, 20889, new Class[]{i.class}, Object.class)) {
            return r.a();
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32015a, false, 20889, new Class[]{i.class}, Object.class);
    }
}
