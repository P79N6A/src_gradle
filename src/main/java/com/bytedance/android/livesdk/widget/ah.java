package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ah implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18428a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18429b;

    ah(aa aaVar) {
        this.f18429b = aaVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18428a, false, 14695, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18428a, false, 14695, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f18429b.a(0);
    }
}
