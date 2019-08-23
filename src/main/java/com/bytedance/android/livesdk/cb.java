package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cb implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9677a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9678b;

    cb(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9678b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9677a, false, 2951, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9677a, false, 2951, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9678b.e(0);
    }
}
