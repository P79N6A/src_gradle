package com.ss.android.ugc.aweme.account.login.ui;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32612a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f32613b;

    d(Bundle bundle) {
        this.f32613b = bundle;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32612a, false, 20461, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32612a, false, 20461, new Class[]{i.class}, Object.class);
        }
        return w.f().a(this.f32613b);
    }
}
