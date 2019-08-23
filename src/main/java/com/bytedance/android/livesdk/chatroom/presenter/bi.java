package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bi implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11290a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11291b;

    public bi(au auVar) {
        this.f11291b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11290a, false, 5278, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11290a, false, 5278, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11291b.b((Throwable) obj);
    }
}
