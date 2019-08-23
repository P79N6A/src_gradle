package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cq implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13650a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13651b;

    cq(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13651b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13650a, false, 2966, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13650a, false, 2966, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f13651b.e(0);
    }
}
