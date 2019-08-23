package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40786a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f40787b = new h();

    private h() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40786a, false, 34259, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f40786a, false, 34259, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dialogInterface.dismiss();
    }
}
