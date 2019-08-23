package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;

public final /* synthetic */ class bd implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62512a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnDismissListener f62513b = new bd();

    private bd() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f62512a, false, 68448, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f62512a, false, 68448, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        a.a();
    }
}
