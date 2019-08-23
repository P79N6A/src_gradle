package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.livesdk.bgbroadcast.BgBroadcastFragment;
import com.bytedance.android.livesdkapi.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements a.C0130a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9247a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastFragment.AnonymousClass2 f9248b;

    k(BgBroadcastFragment.AnonymousClass2 r1) {
        this.f9248b = r1;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9247a, false, 3262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9247a, false, 3262, new Class[0], Void.TYPE);
            return;
        }
        BgBroadcastFragment.AnonymousClass2 r0 = this.f9248b;
        com.bytedance.android.live.core.c.a.a("BgBroadcastFragment", "room close onLiveFinished");
        BgBroadcastFragment.this.e();
    }
}
