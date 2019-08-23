package com.bytedance.android.livesdk.user;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17485a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f17486b = new m();

    private m() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17485a, false, 13571, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17485a, false, 13571, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dialogInterface.dismiss();
    }
}
