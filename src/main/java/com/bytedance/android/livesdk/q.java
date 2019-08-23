package com.bytedance.android.livesdk;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16855a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f16856b;

    /* renamed from: c  reason: collision with root package name */
    private final SurfaceView f16857c;

    q(LiveBroadcastFragment liveBroadcastFragment, SurfaceView surfaceView) {
        this.f16856b = liveBroadcastFragment;
        this.f16857c = surfaceView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16855a, false, 2603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16855a, false, 2603, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f16856b;
        SurfaceView surfaceView = this.f16857c;
        if (!liveBroadcastFragment.g) {
            liveBroadcastFragment.k.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LinkCrossRoomWidget.j(), LinkCrossRoomWidget.k());
            if (!g.a(liveBroadcastFragment.getActivity()) || a.e()) {
                layoutParams.topMargin = LinkCrossRoomWidget.i();
            } else {
                layoutParams.topMargin = LinkCrossRoomWidget.i() + ac.d();
            }
            layoutParams.leftMargin = LinkCrossRoomWidget.j();
            surfaceView.setLayoutParams(layoutParams);
            liveBroadcastFragment.k.addView(surfaceView);
        }
    }
}
