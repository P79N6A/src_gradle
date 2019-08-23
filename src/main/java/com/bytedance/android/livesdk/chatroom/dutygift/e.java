package com.bytedance.android.livesdk.chatroom.dutygift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9984a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9985b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9986c;

    e(a aVar, boolean z) {
        this.f9985b = aVar;
        this.f9986c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9984a, false, 4124, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9984a, false, 4124, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9985b.b(this.f9986c);
    }
}
