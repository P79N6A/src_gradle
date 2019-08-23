package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class AbsCaptureWidget extends LiveWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12334a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f12335b;

    public void c() {
        this.f12335b = false;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12334a, false, 6538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12334a, false, 6538, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (!this.f12335b) {
            this.f12335b = true;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12334a, false, 6539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12334a, false, 6539, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f12335b) {
            c();
        }
    }
}
