package com.bytedance.android.livesdk.chatroom.a.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9732a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9733b;

    b(a aVar) {
        this.f9733b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9732a, false, 3936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9732a, false, 3936, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f9733b;
        if (aVar.f9722c != null) {
            aVar.f9722c.a(aVar.f9721b);
        }
    }
}
