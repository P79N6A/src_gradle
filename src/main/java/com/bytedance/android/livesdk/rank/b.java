package com.bytedance.android.livesdk.rank;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16928a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankDialog f16929b;

    b(DailyRankDialog dailyRankDialog) {
        this.f16929b = dailyRankDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16928a, false, 12952, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16928a, false, 12952, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16929b.g.setVisibility(8);
    }
}
