package com.bytedance.android.livesdk.chatroom.interact.d;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10859a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10860b = new k();

    private k() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10859a, false, 5055, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10859a, false, 5055, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(6, "LinkUserInfoCenter", ((Throwable) obj).getStackTrace());
    }
}
