package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cm implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13086a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f13087b = new cm();

    private cm() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13086a, false, 7160, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13086a, false, 7160, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        dialogInterface.dismiss();
    }
}
