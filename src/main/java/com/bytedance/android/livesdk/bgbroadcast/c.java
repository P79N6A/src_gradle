package com.bytedance.android.livesdk.bgbroadcast;

import com.bytedance.android.livesdk.chatroom.event.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9179a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastFragment f9180b;

    c(BgBroadcastFragment bgBroadcastFragment) {
        this.f9180b = bgBroadcastFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9179a, false, 3252, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9179a, false, 3252, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9180b.onEvent((s) obj);
    }
}
