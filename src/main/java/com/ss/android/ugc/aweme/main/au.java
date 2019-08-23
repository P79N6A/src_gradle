package com.ss.android.ugc.aweme.main;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class au implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54356a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54357b;

    au(MainPageFragment mainPageFragment) {
        this.f54357b = mainPageFragment;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54356a, false, 57546, new Class[]{i.class}, Object.class)) {
            return this.f54357b.lambda$showFollowLiveLabel$17$MainPageFragment(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54356a, false, 57546, new Class[]{i.class}, Object.class);
    }
}
