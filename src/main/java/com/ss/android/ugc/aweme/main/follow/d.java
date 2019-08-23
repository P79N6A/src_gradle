package com.ss.android.ugc.aweme.main.follow;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54751a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastWarn f54752b;

    d(LiveBroadcastWarn liveBroadcastWarn) {
        this.f54752b = liveBroadcastWarn;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54751a, false, 58025, new Class[]{i.class}, Object.class)) {
            return LiveBroadcastWarn.AnonymousClass2.a(this.f54752b, iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54751a, false, 58025, new Class[]{i.class}, Object.class);
    }
}
