package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class du implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10584a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10585b;

    public du(cy cyVar) {
        this.f10585b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10584a, false, 4845, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10584a, false, 4845, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10585b.a((Throwable) obj);
    }
}
