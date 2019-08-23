package com.bytedance.android.livesdk;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class br implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9274a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9275b;

    br(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9275b = startLiveFragmentDefault;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9274a, false, 2941, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9274a, false, 2941, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        f.a((Context) this.f9275b.f8846c);
    }
}
