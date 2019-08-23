package com.bytedance.android.livesdk.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9084a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9085b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9086c;

    b(a aVar, boolean z) {
        this.f9085b = aVar;
        this.f9086c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9084a, false, 3182, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9084a, false, 3182, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9085b;
        aVar.f9083b.a(this.f9086c);
    }
}
