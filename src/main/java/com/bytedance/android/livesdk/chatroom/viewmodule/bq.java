package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class bq implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13040a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13041b;

    bq(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13041b = linkPKMvpWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13040a, false, 7100, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13040a, false, 7100, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkPKMvpWidget linkPKMvpWidget = this.f13041b;
        linkPKMvpWidget.a((List) obj, linkPKMvpWidget.f12623f, (LinearLayout) view, true);
    }
}
