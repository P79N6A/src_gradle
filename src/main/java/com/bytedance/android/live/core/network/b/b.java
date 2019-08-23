package com.bytedance.android.live.core.network.b;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7856a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f7857b;

    b(Runnable runnable) {
        this.f7857b = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f7856a, false, 426, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f7856a, false, 426, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        Runnable runnable = this.f7857b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
