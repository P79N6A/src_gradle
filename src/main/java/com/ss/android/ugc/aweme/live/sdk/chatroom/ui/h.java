package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53530a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBroadcastView f53531b;

    h(TTLiveBroadcastView tTLiveBroadcastView) {
        this.f53531b = tTLiveBroadcastView;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f53530a, false, 55922, new Class[]{i.class}, Object.class)) {
            return this.f53531b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f53530a, false, 55922, new Class[]{i.class}, Object.class);
    }
}
