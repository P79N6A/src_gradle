package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class br implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13042a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKMvpWidget f13043b;

    br(LinkPKMvpWidget linkPKMvpWidget) {
        this.f13043b = linkPKMvpWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13042a, false, 7101, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13042a, false, 7101, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkPKMvpWidget linkPKMvpWidget = this.f13043b;
        LinearLayout linearLayout = (LinearLayout) view;
        LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) obj;
        if (dVar == LinkCrossRoomDataHolder.d.PENAL) {
            linkPKMvpWidget.a((List) linkPKMvpWidget.f12607b.get("data_pk_mvp_list_anchor"), linkPKMvpWidget.f12623f, linearLayout, true);
            return;
        }
        if (dVar == LinkCrossRoomDataHolder.d.FINISHED) {
            linearLayout.setVisibility(8);
        }
    }
}
