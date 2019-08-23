package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ey implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13255a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnDismissListener f13256b = new ey();

    private ey() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13255a, false, 7618, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13255a, false, 7618, new Class[]{DialogInterface.class}, Void.TYPE);
        }
    }
}
