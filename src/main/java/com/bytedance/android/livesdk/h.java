package com.bytedance.android.livesdk;

import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.viewmodule.VideoWidget2;
import com.bytedance.android.livesdk.chatroom.viewmodule.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15483a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f15484b;

    h(LiveBroadcastFragment liveBroadcastFragment) {
        this.f15484b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15483a, false, 2594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15483a, false, 2594, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f15484b;
        if (liveBroadcastFragment.h != null) {
            ((ak) liveBroadcastFragment.v).d();
            if (liveBroadcastFragment.h != null && (liveBroadcastFragment.v instanceof VideoWidget2)) {
                VideoWidget2 videoWidget2 = (VideoWidget2) liveBroadcastFragment.v;
                FrameLayout frameLayout = liveBroadcastFragment.h.H;
                FragmentManager childFragmentManager = liveBroadcastFragment.h.getChildFragmentManager();
                videoWidget2.A = frameLayout;
                videoWidget2.B = childFragmentManager;
            }
        }
    }
}
