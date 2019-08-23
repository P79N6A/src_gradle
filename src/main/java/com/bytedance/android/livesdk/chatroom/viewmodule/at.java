package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class at implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12992a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f12993b = new at();

    private at() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12992a, false, 6979, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12992a, false, 6979, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkControlWidget.b.a(dialogInterface);
    }
}
