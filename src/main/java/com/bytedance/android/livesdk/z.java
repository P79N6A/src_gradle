package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18610a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment f18611b;

    z(LiveRoomFragment liveRoomFragment) {
        this.f18611b = liveRoomFragment;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18610a, false, 2717, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18610a, false, 2717, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18611b.l();
    }
}
