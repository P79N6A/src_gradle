package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.livesdk.live.a.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9249a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastServiceImpl f9250b;

    l(BgBroadcastServiceImpl bgBroadcastServiceImpl) {
        this.f9250b = bgBroadcastServiceImpl;
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9249a, false, 3283, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9249a, false, 3283, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9250b.lambda$onCreate$0$BgBroadcastServiceImpl(i);
    }
}
