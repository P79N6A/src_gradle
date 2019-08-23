package com.bytedance.android.livesdk.chatroom.ui;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class db implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12056a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12057b;

    db(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12057b = liveProfileDetailFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12056a, false, 6127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12056a, false, 6127, new Class[0], Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12057b;
        ViewGroup.LayoutParams layoutParams = liveProfileDetailFragment.o.getLayoutParams();
        layoutParams.width = 0;
        liveProfileDetailFragment.o.setLayoutParams(layoutParams);
    }
}
