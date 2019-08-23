package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12285a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f12286b;

    n(Runnable runnable) {
        this.f12286b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12285a, false, 5568, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12285a, false, 5568, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Runnable runnable = this.f12286b;
        dialogInterface.dismiss();
        runnable.run();
    }
}
