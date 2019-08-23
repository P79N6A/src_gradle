package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.p;
import com.bytedance.android.livesdk.chatroom.presenter.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11355a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11356b;

    public g(f fVar) {
        this.f11356b = fVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11355a, false, 5161, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11355a, false, 5161, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((f.a) this.f11356b.b()).a((p) ((d) obj).f7871b);
    }
}
