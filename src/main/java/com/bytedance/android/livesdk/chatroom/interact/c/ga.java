package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ga implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10725a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10726b;

    ga(fl flVar) {
        this.f10726b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10725a, false, 4967, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10725a, false, 4967, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10726b.a((Throwable) obj);
    }
}
