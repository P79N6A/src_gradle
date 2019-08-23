package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Point;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final /* synthetic */ class du implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66796a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66797b;

    du(PlanC planC) {
        this.f66797b = planC;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66796a, false, 74348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66796a, false, 74348, new Class[0], Void.TYPE);
            return;
        }
        PlanC planC = this.f66797b;
        b a2 = new b.a(planC.getActivity()).b(planC.c() ? C0906R.string.f4483tv : C0906R.string.dp7).a(3000).a(true).a();
        int[] iArr = new int[2];
        View findViewById = planC.n.findViewById(C0906R.id.b6a);
        findViewById.getLocationOnScreen(iArr);
        a2.a((com.bytedance.ies.dmt.ui.base.b<Point>) new dw<Point>(iArr));
        a2.update();
        int b2 = ((fc.b(planC.getActivity()) - a2.d()) + (planC.getResources().getDimensionPixelSize(C0906R.dimen.f_) * 2)) - ((int) UIUtils.dip2Px(planC.getActivity(), 16.0f));
        a2.a(findViewById, 48, (float) ((iArr[0] - b2) - planC.getResources().getDimensionPixelSize(C0906R.dimen.f_)), b2);
        a.L.a(e.a.AmericaRecordUploadGuideShow, true);
    }
}
