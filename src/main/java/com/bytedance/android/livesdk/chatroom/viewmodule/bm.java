package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bm implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13032a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomAudioWidget f13033b;

    bm(LinkInRoomAudioWidget linkInRoomAudioWidget) {
        this.f13033b = linkInRoomAudioWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13032a, false, 7081, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13032a, false, 7081, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkInRoomAudioWidget linkInRoomAudioWidget = this.f13033b;
        linkInRoomAudioWidget.startActivity(TTLiveSDKContext.getHostService().o().a(linkInRoomAudioWidget.context));
        dialogInterface.dismiss();
    }
}
