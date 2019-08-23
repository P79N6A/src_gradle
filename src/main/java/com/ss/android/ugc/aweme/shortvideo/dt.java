package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final /* synthetic */ class dt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66794a;

    /* renamed from: b  reason: collision with root package name */
    private final PlanC f66795b;

    public dt(PlanC planC) {
        this.f66795b = planC;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66794a, false, 74347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66794a, false, 74347, new Class[0], Void.TYPE);
            return;
        }
        PlanC planC = this.f66795b;
        new b.a(planC.getActivity()).b((int) C0906R.string.cdt).a(3000).a().a(planC.K, 48, ((float) (planC.K.getMeasuredWidth() / 2)) - UIUtils.dip2Px(planC.getActivity(), 6.0f), (-planC.K.getMeasuredWidth()) / 2);
        a.L.a(e.a.EnableCommerceUnlockStickerCollectTips, false);
    }
}
