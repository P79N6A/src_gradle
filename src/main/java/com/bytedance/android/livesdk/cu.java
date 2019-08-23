package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cu implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13659a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13660b;

    cu(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13660b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13659a, false, 2970, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13659a, false, 2970, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13660b;
        startLiveFragmentDefault.a(startLiveFragmentDefault.h.getId());
    }
}
