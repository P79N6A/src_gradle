package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ab implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10357a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10358b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10359c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10360d;

    ab(x xVar, int i, long j) {
        this.f10358b = xVar;
        this.f10359c = i;
        this.f10360d = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10357a, false, 4663, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10357a, false, 4663, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10358b.a(this.f10359c, this.f10360d, (d) obj);
    }
}
