package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class am implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10382a;

    /* renamed from: b  reason: collision with root package name */
    private final al f10383b;

    am(al alVar) {
        this.f10383b = alVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10382a, false, 4682, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10382a, false, 4682, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10383b.g();
    }
}
