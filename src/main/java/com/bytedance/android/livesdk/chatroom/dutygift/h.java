package com.bytedance.android.livesdk.chatroom.dutygift;

import com.bytedance.android.livesdk.chatroom.dutygift.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9993a;

    /* renamed from: b  reason: collision with root package name */
    private final f f9994b;

    h(f fVar) {
        this.f9994b = fVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9993a, false, 4131, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9993a, false, 4131, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ((f.a) this.f9994b.b()).c(null);
    }
}
