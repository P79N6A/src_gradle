package com.bytedance.android.livesdk.chatroom.ui;

import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12075a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileSettingDialog f12076b;

    dh(LiveProfileSettingDialog liveProfileSettingDialog) {
        this.f12076b = liveProfileSettingDialog;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12075a, false, 6198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12075a, false, 6198, new Class[0], Void.TYPE);
            return;
        }
        LiveProfileSettingDialog liveProfileSettingDialog = this.f12076b;
        if (liveProfileSettingDialog.f11674c) {
            int b2 = ac.b();
            ViewGroup.LayoutParams layoutParams = liveProfileSettingDialog.i.getLayoutParams();
            layoutParams.width = b2;
            liveProfileSettingDialog.i.setLayoutParams(layoutParams);
            liveProfileSettingDialog.i.requestLayout();
        }
    }
}
