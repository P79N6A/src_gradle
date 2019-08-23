package com.bytedance.android.livesdk.admin.c;

import com.bytedance.android.livesdk.admin.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8975a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8976b;

    e(a aVar) {
        this.f8976b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8975a, false, 3088, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8975a, false, 3088, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8976b.f8964b.a((c) null, (Exception) ((Throwable) obj));
    }
}
