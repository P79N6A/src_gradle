package com.bytedance.android.livesdk.chatroom.dutygift;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10000a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnDismissListener f10001b = new k();

    private k() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f10000a, false, 4177, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f10000a, false, 4177, new Class[]{DialogInterface.class}, Void.TYPE);
        }
    }
}
