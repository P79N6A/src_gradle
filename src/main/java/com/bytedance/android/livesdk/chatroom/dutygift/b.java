package com.bytedance.android.livesdk.chatroom.dutygift;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9977a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9978b;

    b(a aVar) {
        this.f9978b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9977a, false, 4121, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9977a, false, 4121, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9978b.a((d) obj);
    }
}
