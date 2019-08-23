package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10963a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomVideoGuestWidget f10964b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f10965c;

    public j(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget, Runnable runnable) {
        this.f10964b = linkInRoomVideoGuestWidget;
        this.f10965c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10963a, false, 4414, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f10963a, false, 4414, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = this.f10964b;
        Runnable runnable = this.f10965c;
        dialogInterface.dismiss();
        linkInRoomVideoGuestWidget.g = runnable;
        linkInRoomVideoGuestWidget.f10255c.g();
    }
}
