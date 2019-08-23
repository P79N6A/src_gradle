package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10332a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10333b;

    b(LinkDialog linkDialog) {
        this.f10333b = linkDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f10332a, false, 4331, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f10332a, false, 4331, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f10333b.e();
    }
}
