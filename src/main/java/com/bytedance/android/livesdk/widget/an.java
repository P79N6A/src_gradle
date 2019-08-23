package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class an implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18441a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveSetController$5 f18442b;

    an(StartLiveSetController$5 startLiveSetController$5) {
        this.f18442b = startLiveSetController$5;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18441a, false, 14709, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18441a, false, 14709, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f18442b.f1868c.g();
    }
}
