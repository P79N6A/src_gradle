package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13176a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13177b = new dp();

    private dp() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13176a, false, 7285, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13176a, false, 7285, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("MagicBoxWidget", (Throwable) obj);
    }
}
