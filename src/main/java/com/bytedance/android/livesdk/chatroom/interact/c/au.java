package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class au implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10397a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f10398b;

    au(ar arVar) {
        this.f10398b = arVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10397a, false, 4693, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10397a, false, 4693, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10398b.b((d) obj);
    }
}
