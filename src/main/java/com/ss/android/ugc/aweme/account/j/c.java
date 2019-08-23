package com.ss.android.ugc.aweme.account.j;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.r;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32013a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f32014b;

    c(Bundle bundle) {
        this.f32014b = bundle;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f32013a, false, 20888, new Class[]{i.class}, Object.class)) {
            return r.b(this.f32014b);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32013a, false, 20888, new Class[]{i.class}, Object.class);
    }
}
