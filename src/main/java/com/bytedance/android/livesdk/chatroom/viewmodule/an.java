package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class an implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12980a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkControlWidget f12981b;

    an(LinkControlWidget linkControlWidget) {
        this.f12981b = linkControlWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12980a, false, 6958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12980a, false, 6958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkControlWidget linkControlWidget = this.f12981b;
        dialogInterface.dismiss();
        if (linkControlWidget.isViewValid()) {
            linkControlWidget.f12581f.a(0);
            aa.a(linkControlWidget.g, "click_connection_button", "anchor_connection", true);
        }
    }
}
