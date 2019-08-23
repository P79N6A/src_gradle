package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class an implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11227a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11228b;

    an(af afVar) {
        this.f11228b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11227a, false, 5239, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11227a, false, 5239, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11228b;
        Throwable th = (Throwable) obj;
        afVar.f11210d = false;
        if (afVar.b() != null) {
            ((af.b) afVar.b()).b(th);
        }
    }
}
