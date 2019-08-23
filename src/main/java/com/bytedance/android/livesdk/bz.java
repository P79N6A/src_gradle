package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bz implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9667a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9668b;

    bz(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9668b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9667a, false, 2949, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9667a, false, 2949, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9668b.e(0);
    }
}
