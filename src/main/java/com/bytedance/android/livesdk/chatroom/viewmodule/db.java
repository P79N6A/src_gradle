package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class db implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13144a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget f13145b;

    db(LiveShareWidget liveShareWidget) {
        this.f13145b = liveShareWidget;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13144a, false, 7249, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13144a, false, 7249, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveShareWidget liveShareWidget = this.f13145b;
        j.a((a) obj, liveShareWidget.f12659c, liveShareWidget.dataCenter);
    }
}
