package com.bytedance.android.livesdk.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9093a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9094b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9095c;

    e(a aVar, boolean z) {
        this.f9094b = aVar;
        this.f9095c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9093a, false, 3185, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9093a, false, 3185, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9094b;
        aVar.f9083b.b(this.f9095c, (Exception) ((Throwable) obj));
    }
}
