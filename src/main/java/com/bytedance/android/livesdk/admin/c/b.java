package com.bytedance.android.livesdk.admin.c;

import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8966a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8967b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8968c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8969d;

    b(a aVar, long j, boolean z) {
        this.f8967b = aVar;
        this.f8968c = j;
        this.f8969d = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8966a, false, 3085, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8966a, false, 3085, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f8967b;
        long j = this.f8968c;
        boolean z = this.f8969d;
        User user = new User();
        user.setId(j);
        aVar.f8964b.a(z, user);
    }
}
