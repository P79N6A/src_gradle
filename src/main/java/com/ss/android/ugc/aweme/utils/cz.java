package com.ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.cy;

public final /* synthetic */ class cz implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75724a;

    /* renamed from: b  reason: collision with root package name */
    private final cy.a f75725b;

    cz(cy.a aVar) {
        this.f75725b = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f75724a, false, 88471, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f75724a, false, 88471, new Class[]{DialogInterface.class}, Void.TYPE);
        }
    }
}
