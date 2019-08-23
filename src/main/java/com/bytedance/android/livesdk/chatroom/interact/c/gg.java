package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10742a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10743b;

    gg(gc gcVar) {
        this.f10743b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10742a, false, 4990, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10742a, false, 4990, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10743b;
        gcVar.f10732b = false;
        gcVar.a();
    }
}
