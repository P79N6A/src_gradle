package com.bytedance.android.livesdk;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16742a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16743b;

    o(LiveBroadcastFragment liveBroadcastFragment) {
        this.f16743b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16742a, false, 2601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16742a, false, 2601, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f16743b;
        if (!liveBroadcastFragment.g) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) liveBroadcastFragment.j.getLayoutParams();
            layoutParams.width = LinkCrossRoomWidget.j();
            layoutParams.height = LinkCrossRoomWidget.k();
            layoutParams.gravity = 3;
            if (!g.a(liveBroadcastFragment.getContext()) || a.e()) {
                layoutParams.topMargin = LinkCrossRoomWidget.i();
            } else {
                layoutParams.topMargin = LinkCrossRoomWidget.i() + ac.d();
            }
            liveBroadcastFragment.j.setLayoutParams(layoutParams);
            if (liveBroadcastFragment.w != null) {
                liveBroadcastFragment.w.a(true);
            }
        }
    }
}
