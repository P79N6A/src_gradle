package com.bytedance.android.livesdk.gift.impl;

import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15085a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15086b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15087c;

    f(b bVar, long j) {
        this.f15086b = bVar;
        this.f15087c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15085a, false, 9811, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15085a, false, 9811, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15086b;
        long j = this.f15087c;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            bVar.a((Exception) th);
        }
        o.a(j, bVar.f15059b.getId(), th);
    }
}
