package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18423a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18424b;

    af(aa aaVar) {
        this.f18424b = aaVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18423a, false, 14693, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18423a, false, 14693, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18424b;
        aaVar.a(0);
        aaVar.c(0);
    }
}
