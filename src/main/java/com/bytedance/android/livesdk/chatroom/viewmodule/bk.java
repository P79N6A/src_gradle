package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bk implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13027a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomAudioWidget f13028b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f13029c;

    bk(LinkInRoomAudioWidget linkInRoomAudioWidget, Runnable runnable) {
        this.f13028b = linkInRoomAudioWidget;
        this.f13029c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13027a, false, 7079, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13027a, false, 7079, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkInRoomAudioWidget linkInRoomAudioWidget = this.f13028b;
        Runnable runnable = this.f13029c;
        dialogInterface.dismiss();
        linkInRoomAudioWidget.i = runnable;
        linkInRoomAudioWidget.f12612c.i();
    }
}
