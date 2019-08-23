package com.bytedance.android.livesdk.chatroom.interact.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10855a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10856b;

    i(a aVar) {
        this.f10856b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10855a, false, 5053, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10855a, false, 5053, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10856b;
        aVar.a((Throwable) obj);
        aVar.f10837c = false;
    }
}
