package com.ss.android.ugc.aweme.base.component;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34717a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f34718b;

    d(Runnable runnable) {
        this.f34718b = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f34717a, false, 24593, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f34717a, false, 24593, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f34718b.run();
    }
}
