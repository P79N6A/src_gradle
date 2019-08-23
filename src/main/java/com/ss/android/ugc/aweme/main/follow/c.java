package com.ss.android.ugc.aweme.main.follow;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54749a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastWarn f54750b;

    c(LiveBroadcastWarn liveBroadcastWarn) {
        this.f54750b = liveBroadcastWarn;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54749a, false, 58022, new Class[]{i.class}, Object.class)) {
            return this.f54750b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54749a, false, 58022, new Class[]{i.class}, Object.class);
    }
}
