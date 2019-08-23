package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class EndWidget extends LiveWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12495a;

    public int getLayoutId() {
        return C0906R.layout.aoq;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12495a, false, 6782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12495a, false, 6782, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_widget_loaded", new g());
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12495a, false, 6783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12495a, false, 6783, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }
}
