package com.bytedance.android.livesdk.gift.impl;

import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15077a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15078b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15079c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15080d;

    d(b bVar, long j, long j2) {
        this.f15078b = bVar;
        this.f15079c = j;
        this.f15080d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15077a, false, 9809, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15077a, false, 9809, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15078b;
        long j = this.f15079c;
        long j2 = this.f15080d;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            bVar.a((Exception) th);
        }
        o.b(j, j2, th);
    }
}
