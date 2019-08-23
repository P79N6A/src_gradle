package com.ss.android.ugc.aweme.login;

import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53763a;

    /* renamed from: b  reason: collision with root package name */
    static final a.g f53764b = new g();

    private g() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f53763a, false, 56371, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f53763a, false, 56371, new Class[]{i.class}, Object.class);
        }
        MultiAccountViewModel.a(true);
        return (Bundle) iVar.e();
    }
}
