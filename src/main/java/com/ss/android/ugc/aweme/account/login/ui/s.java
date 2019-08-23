package com.ss.android.ugc.aweme.account.login.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32645a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f32646b = new s();

    private s() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32645a, false, 20650, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32645a, false, 20650, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
        }
    }
}
