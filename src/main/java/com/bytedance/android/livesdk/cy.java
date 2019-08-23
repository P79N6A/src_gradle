package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.StartLiveFragmentDefault;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cy implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13667a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault.AnonymousClass10 f13668b;

    cy(StartLiveFragmentDefault.AnonymousClass10 r1) {
        this.f13668b = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13667a, false, 2976, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13667a, false, 2976, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault.this.r();
    }
}
