package com.ss.android.ugc.aweme.account.login.ui;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.r;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32608a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f32609b;

    b(Bundle bundle) {
        this.f32609b = bundle;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f32608a, false, 20459, new Class[]{i.class}, Object.class)) {
            return r.b(this.f32609b);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32608a, false, 20459, new Class[]{i.class}, Object.class);
    }
}
