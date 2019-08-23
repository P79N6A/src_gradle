package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11372a;

    /* renamed from: b  reason: collision with root package name */
    private final k f11373b;

    m(k kVar) {
        this.f11373b = kVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11372a, false, 5175, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11372a, false, 5175, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        k kVar = this.f11373b;
        Throwable th = (Throwable) obj;
        if (kVar.b() != null) {
            ((k.a) kVar.b()).a(th);
        }
    }
}
