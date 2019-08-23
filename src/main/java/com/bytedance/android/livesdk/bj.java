package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bj implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9257a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9258b;

    bj(StartLiveFragmentD startLiveFragmentD) {
        this.f9258b = startLiveFragmentD;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9257a, false, 2858, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9257a, false, 2858, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9258b;
        dialogInterface.dismiss();
        if (startLiveFragmentD.A != null) {
            startLiveFragmentD.A.b();
        }
    }
}
