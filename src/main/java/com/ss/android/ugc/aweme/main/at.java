package com.ss.android.ugc.aweme.main;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class at implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54354a;

    /* renamed from: b  reason: collision with root package name */
    private final MainPageFragment f54355b;

    at(MainPageFragment mainPageFragment) {
        this.f54355b = mainPageFragment;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54354a, false, 57545, new Class[]{i.class}, Object.class)) {
            return this.f54355b.lambda$showFollowAvatar$16$MainPageFragment(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54354a, false, 57545, new Class[]{i.class}, Object.class);
    }
}
