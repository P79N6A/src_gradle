package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12013a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveInputDialogFragment f12014b;

    cj(LiveInputDialogFragment liveInputDialogFragment) {
        this.f12014b = liveInputDialogFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12013a, false, 5976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12013a, false, 5976, new Class[0], Void.TYPE);
            return;
        }
        LiveInputDialogFragment liveInputDialogFragment = this.f12014b;
        if (liveInputDialogFragment.isAdded()) {
            liveInputDialogFragment.f11583f.requestFocus();
            s.a(liveInputDialogFragment.getContext(), liveInputDialogFragment.f11583f);
        }
    }
}
