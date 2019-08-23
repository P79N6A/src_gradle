package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33038a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f33039b = new e();

    private e() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33038a, false, 21021, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33038a, false, 21021, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
        }
    }
}
