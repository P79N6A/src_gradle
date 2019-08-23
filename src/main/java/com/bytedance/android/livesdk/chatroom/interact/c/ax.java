package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ax implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10403a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f10404b;

    ax(ar arVar) {
        this.f10404b = arVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10403a, false, 4696, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10403a, false, 4696, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10404b.b((Throwable) obj);
    }
}
