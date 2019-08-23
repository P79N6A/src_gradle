package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class at implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10394a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f10395b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10396c;

    at(ar arVar, boolean z) {
        this.f10395b = arVar;
        this.f10396c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10394a, false, 4692, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10394a, false, 4692, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10395b.a(this.f10396c, (Throwable) obj);
    }
}
