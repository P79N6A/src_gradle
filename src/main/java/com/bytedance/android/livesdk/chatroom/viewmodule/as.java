package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class as implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12990a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkControlWidget f12991b;

    as(LinkControlWidget linkControlWidget) {
        this.f12991b = linkControlWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12990a, false, 6963, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12990a, false, 6963, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f12991b.a((Throwable) obj);
    }
}
