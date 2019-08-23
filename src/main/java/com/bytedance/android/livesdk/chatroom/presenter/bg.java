package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11285a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11286b;

    public bg(au auVar) {
        this.f11286b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11285a, false, 5276, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11285a, false, 5276, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11286b;
        Throwable th = (Throwable) obj;
        auVar.f11246f = false;
        auVar.b(th);
        ((au.b) auVar.b()).b(th);
    }
}
