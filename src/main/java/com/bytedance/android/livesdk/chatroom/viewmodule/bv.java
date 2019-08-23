package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bv implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13050a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13051b;

    bv(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13051b = linkPKMvpWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13050a, false, 7105, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13050a, false, 7105, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13051b.a(false);
    }
}
