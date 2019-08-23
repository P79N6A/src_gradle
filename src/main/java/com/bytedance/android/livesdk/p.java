package com.bytedance.android.livesdk;

import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16782a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16783b;

    p(LiveBroadcastFragment liveBroadcastFragment) {
        this.f16783b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16782a, false, 2602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16782a, false, 2602, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f16783b;
        if (!liveBroadcastFragment.g) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liveBroadcastFragment.j.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            liveBroadcastFragment.j.setLayoutParams(layoutParams);
        }
    }
}
