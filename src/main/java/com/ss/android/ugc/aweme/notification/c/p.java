package com.ss.android.ugc.aweme.notification.c;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58074a;

    /* renamed from: b  reason: collision with root package name */
    private final n f58075b;

    p(n nVar) {
        this.f58075b = nVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58074a, false, 63230, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58074a, false, 63230, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        n nVar = this.f58075b;
        dialogInterface.dismiss();
        if (i == 0) {
            nVar.k();
        }
    }
}
