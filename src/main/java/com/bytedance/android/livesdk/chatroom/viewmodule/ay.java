package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ay implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13001a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13002b;

    ay(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13002b = linkCrossRoomWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13001a, false, 7025, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13001a, false, 7025, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkCrossRoomWidget linkCrossRoomWidget = this.f13002b;
        if (linkCrossRoomWidget.isViewValid()) {
            linkCrossRoomWidget.f12603d.c();
            dialogInterface.dismiss();
        }
    }
}
