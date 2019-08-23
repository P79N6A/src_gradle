package com.bytedance.android.livesdk.chatroom.interact;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10997a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10998b = new u();

    private u() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10997a, false, 4435, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10997a, false, 4435, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
