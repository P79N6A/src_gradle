package com.bytedance.android.livesdk.chatroom.interact.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10273a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10274b = new d();

    private d() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10273a, false, 4611, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10273a, false, 4611, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
