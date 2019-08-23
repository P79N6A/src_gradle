package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.a;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33046a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileActivity f33047b;

    h(BaseBindMobileActivity baseBindMobileActivity) {
        this.f33047b = baseBindMobileActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33046a, false, 21071, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f33046a, false, 21071, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseBindMobileActivity baseBindMobileActivity = this.f33047b;
        a aVar = (a) obj;
        if (aVar == null || !aVar.f32741b) {
            baseBindMobileActivity.onBackPressed();
        } else {
            baseBindMobileActivity.finish();
        }
    }
}
