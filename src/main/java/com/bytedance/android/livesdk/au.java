package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.StartLiveBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class au implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9069a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveBaseFragment.AnonymousClass1 f9070b;

    au(StartLiveBaseFragment.AnonymousClass1 r1) {
        this.f9070b = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9069a, false, 2798, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9069a, false, 2798, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f9070b.a();
    }
}
