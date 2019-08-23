package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13052a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13053b;

    bw(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13053b = linkPKMvpWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13052a, false, 7106, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13052a, false, 7106, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13053b.a(true);
    }
}
