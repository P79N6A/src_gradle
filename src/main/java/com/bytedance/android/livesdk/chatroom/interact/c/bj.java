package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10431a;

    /* renamed from: b  reason: collision with root package name */
    private final bg f10432b;

    bj(bg bgVar) {
        this.f10432b = bgVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10431a, false, 4712, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10431a, false, 4712, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10432b.c();
    }
}
