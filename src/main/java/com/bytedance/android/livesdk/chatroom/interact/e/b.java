package com.bytedance.android.livesdk.chatroom.interact.e;

import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10898a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10899b;

    b(a aVar) {
        this.f10899b = aVar;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10898a, false, 5074, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10898a, false, 5074, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10899b.a();
    }
}
