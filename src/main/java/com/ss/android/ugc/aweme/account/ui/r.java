package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.a;

public final /* synthetic */ class r implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33066a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdatePasswordActivity f33067b;

    r(UpdatePasswordActivity updatePasswordActivity) {
        this.f33067b = updatePasswordActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33066a, false, 21188, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f33066a, false, 21188, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        UpdatePasswordActivity updatePasswordActivity = this.f33067b;
        a aVar = (a) obj;
        if (aVar == null || !aVar.f32741b) {
            updatePasswordActivity.onBackPressed();
        } else {
            updatePasswordActivity.finish();
        }
    }
}
