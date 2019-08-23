package com.bytedance.android.livesdk.chatroom.dutygift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9981a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9982b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9983c;

    d(a aVar, boolean z) {
        this.f9982b = aVar;
        this.f9983c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9981a, false, 4123, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9981a, false, 4123, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9982b.a(this.f9983c, (com.bytedance.android.live.core.network.response.d) obj);
    }
}
