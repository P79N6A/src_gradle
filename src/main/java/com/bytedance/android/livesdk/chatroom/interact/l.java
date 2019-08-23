package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10968a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomVideoGuestWidget f10969b;

    l(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget) {
        this.f10969b = linkInRoomVideoGuestWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f10968a, false, 4416, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f10968a, false, 4416, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f10969b.f10254b = null;
    }
}
