package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class by implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9665a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9666b;

    by(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9666b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9665a, false, 2948, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9665a, false, 2948, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9666b.e(0);
    }
}
