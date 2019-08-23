package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.livesdk.bgbroadcast.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements a.C0072a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9251a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastServiceImpl f9252b;

    m(BgBroadcastServiceImpl bgBroadcastServiceImpl) {
        this.f9252b = bgBroadcastServiceImpl;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9251a, false, 3284, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9251a, false, 3284, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9252b.lambda$onCreate$1$BgBroadcastServiceImpl(i);
    }
}
