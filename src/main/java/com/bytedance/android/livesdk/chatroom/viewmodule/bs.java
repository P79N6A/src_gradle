package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bs implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13044a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13045b;

    bs(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13045b = linkPKMvpWidget;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13044a, false, 7102, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13044a, false, 7102, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ((LinearLayout) view).setOnClickListener(new bv(this.f13045b));
    }
}
