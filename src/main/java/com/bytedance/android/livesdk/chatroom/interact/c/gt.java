package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.browser.jsbridge.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gt implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10769a;

    /* renamed from: b  reason: collision with root package name */
    private final gs f10770b;

    gt(gs gsVar) {
        this.f10770b = gsVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10769a, false, 5008, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10769a, false, 5008, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10770b.onEvent((a) obj);
    }
}
