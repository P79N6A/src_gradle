package com.bytedance.android.livesdk.chatroom.end;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10103a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastEndFragment f10104b;

    e(LiveBroadcastEndFragment liveBroadcastEndFragment) {
        this.f10104b = liveBroadcastEndFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f10103a, false, 4240, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f10103a, false, 4240, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f10104b.l = false;
    }
}
