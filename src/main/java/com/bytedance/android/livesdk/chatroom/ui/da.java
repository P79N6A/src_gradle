package com.bytedance.android.livesdk.chatroom.ui;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12054a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12055b;

    da(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12055b = liveProfileDetailFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12054a, false, 6126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12054a, false, 6126, new Class[0], Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12055b;
        ViewGroup.LayoutParams layoutParams = liveProfileDetailFragment.m.getLayoutParams();
        layoutParams.width = 0;
        liveProfileDetailFragment.m.setLayoutParams(layoutParams);
    }
}
