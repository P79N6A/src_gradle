package com.bytedance.android.livesdk.chatroom.interact.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10280a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10281b = new g();

    private g() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10280a, false, 4614, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10280a, false, 4614, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
