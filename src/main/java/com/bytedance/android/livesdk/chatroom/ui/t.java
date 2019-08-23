package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12299a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f12300b = new t();

    private t() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12299a, false, 5574, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12299a, false, 5574, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("AbsInteractionFragment", (Throwable) obj);
    }
}
