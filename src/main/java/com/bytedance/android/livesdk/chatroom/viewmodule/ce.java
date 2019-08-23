package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ce implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13069a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13070b;

    ce(LinkPKWidget linkPKWidget) {
        this.f13070b = linkPKWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13069a, false, 7152, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13069a, false, 7152, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13070b.a((Throwable) obj);
    }
}
