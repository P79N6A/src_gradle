package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13288a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f13289b = new q();

    private q() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13288a, false, 6658, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13288a, false, 6658, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("CommonToastWidget", (Throwable) obj);
    }
}
