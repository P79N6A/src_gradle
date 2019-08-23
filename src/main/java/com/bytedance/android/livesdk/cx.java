package com.bytedance.android.livesdk;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cx implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13665a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13666b;

    cx(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13666b = startLiveFragmentDefault;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13665a, false, 2973, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13665a, false, 2973, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13666b;
        f.a((Context) startLiveFragmentDefault.f8846c);
        startLiveFragmentDefault.B.dismiss();
    }
}
