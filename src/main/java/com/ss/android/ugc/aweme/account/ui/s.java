package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.a;

public final /* synthetic */ class s implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33068a;

    /* renamed from: b  reason: collision with root package name */
    private final VerificationActivity f33069b;

    s(VerificationActivity verificationActivity) {
        this.f33069b = verificationActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33068a, false, 21200, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f33068a, false, 21200, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VerificationActivity verificationActivity = this.f33069b;
        a aVar = (a) obj;
        if (aVar == null || !aVar.f32741b) {
            verificationActivity.onBackPressed();
        } else {
            verificationActivity.finish();
        }
    }
}
