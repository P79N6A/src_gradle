package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10999a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f11000b = new v();

    private v() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10999a, false, 4436, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10999a, false, 4436, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.c("link", ((Throwable) obj).toString());
    }
}
