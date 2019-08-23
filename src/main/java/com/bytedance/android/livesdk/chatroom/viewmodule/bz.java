package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bz implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13058a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKStealTowerWidget f13059b;

    bz(LinkPKStealTowerWidget linkPKStealTowerWidget) {
        this.f13059b = linkPKStealTowerWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13058a, false, 7123, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13058a, false, 7123, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13059b.a((Throwable) obj);
    }
}
