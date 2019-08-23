package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cd implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9682a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9683b;

    cd(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9683b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9682a, false, 2953, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9682a, false, 2953, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9683b.e(0);
    }
}
