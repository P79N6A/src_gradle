package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.a;

public final /* synthetic */ class p implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33062a;

    /* renamed from: b  reason: collision with root package name */
    private final ModifyMobileActivity f33063b;

    p(ModifyMobileActivity modifyMobileActivity) {
        this.f33063b = modifyMobileActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33062a, false, 21129, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f33062a, false, 21129, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ModifyMobileActivity modifyMobileActivity = this.f33063b;
        a aVar = (a) obj;
        if (aVar == null || !aVar.f32741b) {
            modifyMobileActivity.onBackPressed();
        } else {
            modifyMobileActivity.finish();
        }
    }
}
