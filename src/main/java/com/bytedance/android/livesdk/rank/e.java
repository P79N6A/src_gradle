package com.bytedance.android.livesdk.rank;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16950a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankDialog f16951b;

    e(DailyRankDialog dailyRankDialog) {
        this.f16951b = dailyRankDialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f16950a, false, 12955, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f16950a, false, 12955, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f16951b.f16877e = false;
    }
}
