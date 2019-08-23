package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.s;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11411a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11412b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11413c;

    public u(s sVar, long j) {
        this.f11412b = sVar;
        this.f11413c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11411a, false, 5204, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11411a, false, 5204, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        s sVar = this.f11412b;
        long j = this.f11413c;
        Throwable th = (Throwable) obj;
        if (sVar.b() != null) {
            ((s.a) sVar.b()).b(th);
        }
        o.a(j, sVar.f11400c.getId(), th);
    }
}
