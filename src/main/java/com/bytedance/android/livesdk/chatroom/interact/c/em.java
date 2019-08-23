package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.ec;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class em implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10626a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10627b;

    em(ec ecVar) {
        this.f10627b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10626a, false, 4883, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10626a, false, 4883, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10627b;
        ecVar.b((Throwable) obj);
        ecVar.f10603b = false;
        ((ec.b) ecVar.b()).b();
    }
}
