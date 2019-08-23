package com.ss.android.ugc.aweme.main.follow;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54747a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastWarn f54748b;

    public b(LiveBroadcastWarn liveBroadcastWarn) {
        this.f54748b = liveBroadcastWarn;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54747a, false, 58021, new Class[]{i.class}, Object.class)) {
            return this.f54748b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54747a, false, 58021, new Class[]{i.class}, Object.class);
    }
}
