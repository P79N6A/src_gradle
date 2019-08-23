package com.bytedance.android.livesdk.rank;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16931a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankDialog f16932b;

    c(DailyRankDialog dailyRankDialog) {
        this.f16932b = dailyRankDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16931a, false, 12953, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16931a, false, 12953, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f16932b.a();
    }
}
