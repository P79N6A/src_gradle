package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bp implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13038a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13039b;

    bp(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13039b = linkPKMvpWidget;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13038a, false, 7099, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13038a, false, 7099, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ((LinearLayout) view).setOnClickListener(new bw(this.f13039b));
    }
}
