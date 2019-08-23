package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class av implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10399a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f10400b;

    av(ar arVar) {
        this.f10400b = arVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10399a, false, 4694, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10399a, false, 4694, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10400b.b((Throwable) obj);
    }
}
