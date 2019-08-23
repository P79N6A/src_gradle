package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aj implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12977a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftWidget f12978b;

    aj(GiftWidget giftWidget) {
        this.f12978b = giftWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12977a, false, 6907, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12977a, false, 6907, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f.a(this.f12978b.context);
        dialogInterface.dismiss();
    }
}
