package com.ss.android.ugc.aweme.crossplatform.activity;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40696a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f40697b = new g();

    private g() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40696a, false, 34169, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40696a, false, 34169, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dialogInterface.dismiss();
    }
}
