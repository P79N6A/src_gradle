package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ba implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11268a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11269b;

    ba(au auVar) {
        this.f11269b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11268a, false, 5270, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11268a, false, 5270, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11269b.b((Throwable) obj);
    }
}
