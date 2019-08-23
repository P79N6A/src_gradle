package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53528a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBroadcastView f53529b;

    g(TTLiveBroadcastView tTLiveBroadcastView) {
        this.f53529b = tTLiveBroadcastView;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f53528a, false, 55913, new Class[]{i.class}, Object.class)) {
            return this.f53529b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f53528a, false, 55913, new Class[]{i.class}, Object.class);
    }
}
