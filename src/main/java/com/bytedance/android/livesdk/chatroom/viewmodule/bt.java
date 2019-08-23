package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class bt implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13046a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13047b;

    bt(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13047b = linkPKMvpWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13046a, false, 7103, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13046a, false, 7103, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkPKMvpWidget linkPKMvpWidget = this.f13047b;
        linkPKMvpWidget.a((List) obj, linkPKMvpWidget.g, (LinearLayout) view, false);
    }
}
