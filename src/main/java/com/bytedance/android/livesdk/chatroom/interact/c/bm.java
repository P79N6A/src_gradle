package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.event.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10441a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10442b;

    bm(bl blVar) {
        this.f10442b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10441a, false, 4728, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10441a, false, 4728, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10442b.onEvent((n) obj);
    }
}
