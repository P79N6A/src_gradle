package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dp implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66786a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66787b;

    dp(PlanC planC) {
        this.f66787b = planC;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66786a, false, 74343, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66786a, false, 74343, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66787b.p();
    }
}
