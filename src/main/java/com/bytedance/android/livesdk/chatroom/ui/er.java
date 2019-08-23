package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class er implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12219a;

    /* renamed from: b  reason: collision with root package name */
    private final eq f12220b;

    er(eq eqVar) {
        this.f12220b = eqVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12219a, false, 6405, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12219a, false, 6405, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f12220b.a((d) obj);
    }
}
