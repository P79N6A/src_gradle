package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class az implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10407a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10408b;

    az(ay ayVar) {
        this.f10408b = ayVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10407a, false, 4700, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10407a, false, 4700, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10408b.c((d) obj);
    }
}
