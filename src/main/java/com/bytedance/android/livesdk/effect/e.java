package com.bytedance.android.livesdk.effect;

import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements LiveFilterAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13765a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFilterFragment f13766b;

    e(LiveFilterFragment liveFilterFragment) {
        this.f13766b = liveFilterFragment;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13765a, false, 8156, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13765a, false, 8156, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        LiveFilterFragment liveFilterFragment = this.f13766b;
        if (liveFilterFragment.f13701b != null) {
            liveFilterFragment.f13701b.a(i);
        }
    }
}
