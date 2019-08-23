package com.bytedance.android.livesdk.chatroom.end;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10101a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastEndFragment f10102b;

    d(LiveBroadcastEndFragment liveBroadcastEndFragment) {
        this.f10102b = liveBroadcastEndFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10101a, false, 4239, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10101a, false, 4239, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10102b.l = ((Boolean) obj).booleanValue();
    }
}
