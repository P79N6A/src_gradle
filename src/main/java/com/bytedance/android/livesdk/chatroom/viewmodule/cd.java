package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13067a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13068b;

    cd(LinkPKWidget linkPKWidget) {
        this.f13068b = linkPKWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13067a, false, 7151, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13067a, false, 7151, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13068b.j.setVisibility(8);
    }
}
