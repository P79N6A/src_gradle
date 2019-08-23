package com.ss.android.ugc.aweme.account.login.authorize;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32131a;

    /* renamed from: b  reason: collision with root package name */
    private final AuthorizeActivity f32132b;

    d(AuthorizeActivity authorizeActivity) {
        this.f32132b = authorizeActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f32131a, false, 20138, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f32131a, false, 20138, new Class[]{i.class}, Object.class);
        }
        ((Bundle) iVar.e()).putString("platform", this.f32132b.o.c());
        ((Bundle) iVar.e()).putBoolean("show_fill_detail", false);
        return (Bundle) iVar.e();
    }
}
