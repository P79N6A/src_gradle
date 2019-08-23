package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ck implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13081a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13082b;

    ck(LinkPKWidget linkPKWidget) {
        this.f13082b = linkPKWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13081a, false, 7158, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13081a, false, 7158, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13082b.a((Throwable) obj);
    }
}
