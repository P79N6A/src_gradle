package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10961a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomVideoAnchorWidget f10962b;

    i(LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget) {
        this.f10962b = linkInRoomVideoAnchorWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f10961a, false, 4376, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f10961a, false, 4376, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f10962b.f10246d = null;
    }
}
