package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53532a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBroadcastView f53533b;

    i(TTLiveBroadcastView tTLiveBroadcastView) {
        this.f53533b = tTLiveBroadcastView;
    }

    public final Object then(a.i iVar) {
        a.i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f53532a, false, 55923, new Class[]{a.i.class}, Object.class)) {
            return this.f53533b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f53532a, false, 55923, new Class[]{a.i.class}, Object.class);
    }
}
