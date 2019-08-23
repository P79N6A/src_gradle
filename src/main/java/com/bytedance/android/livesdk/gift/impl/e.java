package com.bytedance.android.livesdk.gift.impl;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15081a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15082b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15083c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15084d;

    e(b bVar, long j, long j2) {
        this.f15082b = bVar;
        this.f15083c = j;
        this.f15084d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15081a, false, 9810, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15081a, false, 9810, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15082b;
        long j = this.f15083c;
        long j2 = this.f15084d;
        bVar.a((i) ((d) obj).f7871b);
        o.a(j, bVar.f15059b.getId(), SystemClock.uptimeMillis() - j2);
    }
}
