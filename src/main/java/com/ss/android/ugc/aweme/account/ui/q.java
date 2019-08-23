package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33064a;

    /* renamed from: b  reason: collision with root package name */
    private final RequestContactsPermissionAfterBindPhone f33065b;

    q(RequestContactsPermissionAfterBindPhone requestContactsPermissionAfterBindPhone) {
        this.f33065b = requestContactsPermissionAfterBindPhone;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f33064a, false, 21162, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f33064a, false, 21162, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f33065b.finish();
    }
}
