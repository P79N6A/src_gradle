package com.bytedance.android.livesdk.chatroom.dutygift;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.dutygift.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9991a;

    /* renamed from: b  reason: collision with root package name */
    private final f f9992b;

    g(f fVar) {
        this.f9992b = fVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9991a, false, 4130, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9991a, false, 4130, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((f.a) this.f9992b.b()).c((DutyGiftInfo) ((d) obj).f7871b);
    }
}
