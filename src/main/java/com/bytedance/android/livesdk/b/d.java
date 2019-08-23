package com.bytedance.android.livesdk.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9090a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9091b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9092c;

    d(a aVar, boolean z) {
        this.f9091b = aVar;
        this.f9092c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9090a, false, 3184, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9090a, false, 3184, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9091b;
        aVar.f9083b.a(this.f9092c);
    }
}
