package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class am implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13450a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13451b = new am();

    private am() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13450a, false, 7998, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13450a, false, 7998, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(LiveRoomUserInfoWidget.f13403b, (Throwable) obj);
    }
}
