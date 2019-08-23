package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dm implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13170a;

    /* renamed from: b  reason: collision with root package name */
    private final LuckyBoxWidget f13171b;

    dm(LuckyBoxWidget luckyBoxWidget) {
        this.f13171b = luckyBoxWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13170a, false, 7282, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13170a, false, 7282, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().c().a((Activity) this.f13171b.context);
        dialogInterface.dismiss();
    }
}
