package com.bytedance.android.livesdk.chatroom.ui;

import android.support.v7.widget.GridLayoutManager;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.model.x;
import com.bytedance.android.livesdk.chatroom.ui.LuckyBoxSendAdapter;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;

public final /* synthetic */ class eb implements LuckyBoxSendAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12130a;

    /* renamed from: b  reason: collision with root package name */
    private final dy f12131b;

    eb(dy dyVar) {
        this.f12131b = dyVar;
    }

    public final void a(x xVar) {
        x xVar2 = xVar;
        if (PatchProxy.isSupport(new Object[]{xVar2}, this, f12130a, false, 6263, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar2}, this, f12130a, false, 6263, new Class[]{x.class}, Void.TYPE);
            return;
        }
        dy dyVar = this.f12131b;
        if (PatchProxy.isSupport(new Object[]{xVar2}, dyVar, dy.f12118a, false, 6260, new Class[]{x.class}, Void.TYPE)) {
            dy dyVar2 = dyVar;
            PatchProxy.accessDispatch(new Object[]{xVar2}, dyVar2, dy.f12118a, false, 6260, new Class[]{x.class}, Void.TYPE);
            return;
        }
        dyVar.f12122e = xVar2;
        if (Lists.isEmpty(xVar2.f11185e)) {
            dyVar.g.a(Collections.EMPTY_LIST);
            dyVar.h.setText(xVar2.f11186f);
            return;
        }
        if (a.a() && (dyVar.j instanceof GridLayoutManager)) {
            ((GridLayoutManager) dyVar.j).setSpanCount(xVar2.f11185e.size());
        }
        dyVar.g.a(xVar2.f11185e);
        dyVar.h.setText(null);
    }
}
