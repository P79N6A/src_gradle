package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66784a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66785b;

    Cdo(PlanC planC) {
        this.f66785b = planC;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66784a, false, 74342, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66784a, false, 74342, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66785b.f65358f.setVisibility(8);
    }
}
