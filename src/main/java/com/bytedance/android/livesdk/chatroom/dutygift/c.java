package com.bytedance.android.livesdk.chatroom.dutygift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9979a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9980b;

    c(a aVar) {
        this.f9980b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9979a, false, 4122, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9979a, false, 4122, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9980b.c();
    }
}
