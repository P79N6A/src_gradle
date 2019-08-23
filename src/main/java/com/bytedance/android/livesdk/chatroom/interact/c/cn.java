package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10508a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10509b;

    cn(cl clVar) {
        this.f10509b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10508a, false, 4784, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10508a, false, 4784, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10509b.a((Throwable) obj);
    }
}
