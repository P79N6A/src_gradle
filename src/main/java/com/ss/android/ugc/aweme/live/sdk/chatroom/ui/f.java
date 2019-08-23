package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53526a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBroadcastView f53527b;

    f(TTLiveBroadcastView tTLiveBroadcastView) {
        this.f53527b = tTLiveBroadcastView;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f53526a, false, 55912, new Class[]{i.class}, Object.class)) {
            return this.f53527b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f53526a, false, 55912, new Class[]{i.class}, Object.class);
    }
}
