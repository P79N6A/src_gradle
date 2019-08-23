package com.ss.android.ugc.aweme.account.login.authorize;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.r;

public final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32120a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f32121b;

    a(Bundle bundle) {
        this.f32121b = bundle;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f32120a, false, 20135, new Class[]{i.class}, Object.class)) {
            return r.b(this.f32121b);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32120a, false, 20135, new Class[]{i.class}, Object.class);
    }
}
