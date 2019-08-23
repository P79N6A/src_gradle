package com.bytedance.android.livesdk.chatroom.interact;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10992a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10993b = new r();

    private r() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10992a, false, 4425, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10992a, false, 4425, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
