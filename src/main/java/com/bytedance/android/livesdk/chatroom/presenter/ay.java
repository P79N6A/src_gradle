package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ay implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11257a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11258b;

    ay(au auVar) {
        this.f11258b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11257a, false, 5268, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11257a, false, 5268, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11258b.b((Throwable) obj);
    }
}
