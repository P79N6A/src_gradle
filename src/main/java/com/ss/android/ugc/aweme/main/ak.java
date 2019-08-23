package com.ss.android.ugc.aweme.main;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.d.a;

public final /* synthetic */ class ak implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54336a;

    /* renamed from: b  reason: collision with root package name */
    public static final DialogInterface.OnClickListener f54337b = new ak();

    private ak() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54336a, false, 57400, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54336a, false, 57400, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.b(false);
        dialogInterface.dismiss();
    }
}
