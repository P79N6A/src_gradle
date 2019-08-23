package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;

public final class ab extends bx<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11199a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f11200b;

    public interface a extends al {
        void a(com.bytedance.android.livesdk.gift.relay.a.a aVar);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11199a, false, 5216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11199a, false, 5216, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.f11200b != null && !this.f11200b.isDisposed()) {
            this.f11200b.dispose();
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11199a, false, 5215, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11199a, false, 5215, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
    }
}
