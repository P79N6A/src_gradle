package com.bytedance.android.livesdk.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9087a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9088b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9089c;

    c(a aVar, boolean z) {
        this.f9088b = aVar;
        this.f9089c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9087a, false, 3183, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9087a, false, 3183, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9088b;
        aVar.f9083b.b(this.f9089c, (Exception) ((Throwable) obj));
    }
}
