package com.bytedance.android.livesdk.admin.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8970a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8971b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8972c;

    c(a aVar, boolean z) {
        this.f8971b = aVar;
        this.f8972c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8970a, false, 3086, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8970a, false, 3086, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f8971b;
        boolean z = this.f8972c;
        Throwable th = (Throwable) obj;
        if (aVar.f8964b != null) {
            aVar.f8964b.a(z, (Exception) th);
        }
    }
}
