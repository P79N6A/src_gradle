package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10806a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10807b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10808c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10809d;

    r(n nVar, int i, long j) {
        this.f10807b = nVar;
        this.f10808c = i;
        this.f10809d = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10806a, false, 4650, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10806a, false, 4650, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10807b.a(this.f10808c, this.f10809d, (d) obj);
    }
}
