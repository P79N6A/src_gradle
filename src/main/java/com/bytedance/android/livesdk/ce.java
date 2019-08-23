package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ce implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9684a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9685b;

    ce(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9685b = startLiveFragmentDefault;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9684a, false, 2954, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9684a, false, 2954, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9685b;
        if (!s.INST.isLoadedRes()) {
            if (startLiveFragmentDefault.s != null) {
                startLiveFragmentDefault.s.a();
            } else if (startLiveFragmentDefault.getActivity() != null) {
                startLiveFragmentDefault.getActivity().finish();
            }
        }
    }
}
