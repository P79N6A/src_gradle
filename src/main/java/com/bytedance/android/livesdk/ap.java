package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9025a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveActivityProxy f9026b;

    ap(StartLiveActivityProxy startLiveActivityProxy) {
        this.f9026b = startLiveActivityProxy;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f9025a, false, 2767, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f9025a, false, 2767, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        StartLiveActivityProxy startLiveActivityProxy = this.f9026b;
        if (!s.INST.isLoadedRes()) {
            startLiveActivityProxy.f1870f.finish();
        }
    }
}
