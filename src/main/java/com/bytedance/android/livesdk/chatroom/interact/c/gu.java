package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.browser.jsbridge.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gu implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10771a;

    /* renamed from: b  reason: collision with root package name */
    private final gs f10772b;

    gu(gs gsVar) {
        this.f10772b = gsVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10771a, false, 5009, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10771a, false, 5009, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10772b.onEvent((f) obj);
    }
}
