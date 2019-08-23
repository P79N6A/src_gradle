package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.Disposable;

public final class x extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11418a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f11419b;

    public interface a extends al {
        void a(com.bytedance.android.livesdk.gift.relay.a.a aVar);

        void a(y yVar);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11418a, false, 5210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11418a, false, 5210, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.f11419b != null && !this.f11419b.isDisposed()) {
            this.f11419b.dispose();
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11418a, false, 5209, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11418a, false, 5209, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f11418a, false, 5208, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f11418a, false, 5208, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (iMessage2 instanceof y) {
            ((a) b()).a((y) iMessage2);
        }
    }
}
