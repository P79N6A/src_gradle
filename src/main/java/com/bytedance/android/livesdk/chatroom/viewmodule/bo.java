package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bo implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13036a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomAudioWidget f13037b;

    bo(LinkInRoomAudioWidget linkInRoomAudioWidget) {
        this.f13037b = linkInRoomAudioWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13036a, false, 7083, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13036a, false, 7083, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f13037b.f12611b = null;
    }
}
