package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.n;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33036a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f33037b = new d();

    private d() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33036a, false, 21020, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33036a, false, 21020, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        n.e(false);
    }
}
