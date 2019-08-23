package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cv implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13661a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13662b;

    cv(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13662b = startLiveFragmentDefault;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13661a, false, 2971, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13661a, false, 2971, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13662b;
        dialogInterface.dismiss();
        if (startLiveFragmentDefault.r == null) {
            startLiveFragmentDefault.p.a();
        }
    }
}
