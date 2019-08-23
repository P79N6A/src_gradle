package com.ss.android.ugc.aweme;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.a.a.a;
import com.ss.android.account.b;

public final /* synthetic */ class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49997a;

    /* renamed from: b  reason: collision with root package name */
    static final a f49998b = new i();

    private i() {
    }

    public final com.bytedance.sdk.account.k.a a() {
        Object aVar;
        if (PatchProxy.isSupport(new Object[0], this, f49997a, false, 19442, new Class[0], com.bytedance.sdk.account.k.a.class)) {
            aVar = PatchProxy.accessDispatch(new Object[0], this, f49997a, false, 19442, new Class[0], com.bytedance.sdk.account.k.a.class);
        } else {
            aVar = new b.a();
        }
        return (com.bytedance.sdk.account.k.a) aVar;
    }
}
