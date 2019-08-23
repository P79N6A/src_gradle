package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ac implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18417a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18418b;

    ac(aa aaVar) {
        this.f18418b = aaVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18417a, false, 14690, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18417a, false, 14690, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18418b;
        aaVar.a(0);
        aaVar.c(0);
    }
}
