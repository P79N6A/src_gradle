package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bv implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9659a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9660b;

    bv(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9660b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9659a, false, 2945, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9659a, false, 2945, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9660b.b(0);
    }
}
